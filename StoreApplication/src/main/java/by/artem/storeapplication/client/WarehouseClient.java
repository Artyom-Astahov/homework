package by.artem.storeapplication.client;

import by.artem.storeapplication.dto.AssortmentResponseDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "warehouse-ws")
public interface WarehouseClient {

    @GetMapping("/stock/{id}")
    AssortmentResponseDto fetchAssortmentInfo(@PathVariable String id);
}
