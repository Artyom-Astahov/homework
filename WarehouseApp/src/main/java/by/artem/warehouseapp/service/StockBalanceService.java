package by.artem.warehouseapp.service;

import by.artem.warehouseapp.dto.StockBalanceResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class StockBalanceService {

    public StockBalanceResponseDto getStockBalance(String id) {
        return getInDB(id);

    }

    public StockBalanceResponseDto getInDB(String id) {
        Map<String, StockBalanceResponseDto> stockBalanceTable = new HashMap<>();
        stockBalanceTable.put("1", new StockBalanceResponseDto("Помидоры", 1, 100));
        stockBalanceTable.put("2", new StockBalanceResponseDto("Огурцы", 10, 50));
        stockBalanceTable.put("3", new StockBalanceResponseDto("Баклажаны", 50, 20));
        stockBalanceTable.put("4", new StockBalanceResponseDto("Колбаса", 8, 250));
        stockBalanceTable.put("5", new StockBalanceResponseDto("Газировка", 100, 45));
        return stockBalanceTable.get(id);
    }
}
