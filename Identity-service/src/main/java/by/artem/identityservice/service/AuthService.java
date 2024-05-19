package by.artem.identityservice.service;

import by.artem.identityservice.entity.UserCredential;
import by.artem.identityservice.repository.UserCredentialRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final UserCredentialRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;

    public String save(UserCredential user){
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepository.save(user);
        return "User added to the system";
    }

    public String generateToken(String username) {
        return jwtService.generateTokent(username);
    }

    public void validateToken(String token) {
        jwtService.validateToken(token);
    }
}
