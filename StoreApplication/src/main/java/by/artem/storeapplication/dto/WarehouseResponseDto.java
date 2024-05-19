package by.artem.storeapplication.dto;

import lombok.Builder;

@Builder(setterPrefix = "with")
public record WarehouseResponseDto(String name,
                                   Integer count,
                                   Integer price) {
}
