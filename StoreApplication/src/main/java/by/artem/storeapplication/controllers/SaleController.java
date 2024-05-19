package by.artem.storeapplication.controllers;


import by.artem.storeapplication.dto.AssortmentResponseDto;
import by.artem.storeapplication.service.AssortmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/store")
public class SaleController {

    private final AssortmentService assortmentService;

    @GetMapping
    public String greetingHello(){
        return "Hello! I'm Store Application!";
    }

    @GetMapping("/{id}")
    public ResponseEntity<AssortmentResponseDto> getAssortment(@PathVariable(name = "id") String id){
        AssortmentResponseDto responseDto = assortmentService.getAssortmentInfo(id);
        return new ResponseEntity<>(responseDto, HttpStatus.OK);
    }
}
