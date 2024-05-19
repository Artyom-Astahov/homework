package by.artem.storeapplication.client;


import by.artem.storeapplication.dto.WarehouseResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
@RequiredArgsConstructor
public class WarehouseServiceClient {


    private final RestTemplate template;

    public WarehouseResponseDto fetchAssortmentInfo(String orderId) {
        String requestUrl = "http://warehouse-ws/stock/" + orderId;
        return template.getForObject(requestUrl, WarehouseResponseDto.class);
    }
}
