package by.artem.warehouseapp.controller;

import by.artem.warehouseapp.dto.StockBalanceResponseDto;
import by.artem.warehouseapp.service.StockBalanceService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/stock")
public class StockBalanceController {

    private final StockBalanceService stockBalanceService;

    @GetMapping
    public String helloWorld(){
        return "Hello World! It's Warehouse APP";
    }

    @GetMapping("/{id}")
    public ResponseEntity<StockBalanceResponseDto> getStockBalance(@PathVariable("id") String id){
        return new ResponseEntity<>(stockBalanceService.getStockBalance(id), HttpStatus.OK);
    }
}
