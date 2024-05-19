package by.artem.identityservice.controller;

import by.artem.identityservice.dto.AuthRequest;
import by.artem.identityservice.entity.UserCredential;
import by.artem.identityservice.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;
    private final AuthenticationManager authenticationManager;

    @PostMapping("/register")
    public String addNewUser(@RequestBody UserCredential user) {
        return authService.save(user);
    }

    @PostMapping("/token")
    public String getToken(@RequestBody AuthRequest authRequest) {
        try{
            Authentication authentication = authenticationManager
                    .authenticate(new UsernamePasswordAuthenticationToken(authRequest.username(), authRequest.password()));
            if (authentication.isAuthenticated()) {
                return authService.generateToken(authRequest.username());
            } else {
                throw new RuntimeException("invalid access");
            }
        }catch (Exception ex){
             ex.printStackTrace();
            return "ОШИБКА!";
        }
    }

    @GetMapping("/validate")
    public String validateToken(@RequestParam("token") String token) {
        authService.validateToken(token);
        return "Token is valid";
    }
}
