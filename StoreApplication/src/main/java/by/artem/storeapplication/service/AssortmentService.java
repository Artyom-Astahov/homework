package by.artem.storeapplication.service;


import by.artem.storeapplication.client.WarehouseClient;
import by.artem.storeapplication.client.WarehouseServiceClient;
import by.artem.storeapplication.dto.AssortmentResponseDto;
import by.artem.storeapplication.dto.WarehouseResponseDto;
import by.artem.storeapplication.mappers.AssortmentMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AssortmentService {

//    private final WarehouseServiceClient warehouseServiceClient;
    private final WarehouseClient warehouseClient;
    private final AssortmentMapper assortmentMapper;

    public AssortmentResponseDto getAssortmentInfo(String id) {
        AssortmentResponseDto warehouseResponseDto = warehouseClient.fetchAssortmentInfo(id);
        AssortmentResponseDto responseDto = null;
        if (warehouseResponseDto.count() <= 10) {
            Integer priceX2 = warehouseResponseDto.price() * 2;
            responseDto = new AssortmentResponseDto(warehouseResponseDto.name(), warehouseResponseDto.count(), priceX2);
        } else {
            responseDto = warehouseResponseDto;
        }
        return responseDto;
    }
}
