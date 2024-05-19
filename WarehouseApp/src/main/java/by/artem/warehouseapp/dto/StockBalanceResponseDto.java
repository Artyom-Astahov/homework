package by.artem.warehouseapp.dto;

import lombok.Builder;

@Builder(setterPrefix = "with")
public record StockBalanceResponseDto(String name,
                                      Integer count,
                                      Integer price) {
}
