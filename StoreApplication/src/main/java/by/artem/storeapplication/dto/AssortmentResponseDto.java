package by.artem.storeapplication.dto;

import lombok.Builder;

@Builder(setterPrefix = "with")
public record AssortmentResponseDto(String name,
                                    Integer count,
                                    Integer price) {
}
