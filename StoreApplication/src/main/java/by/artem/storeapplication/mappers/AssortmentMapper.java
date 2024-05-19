package by.artem.storeapplication.mappers;



import by.artem.storeapplication.dto.AssortmentResponseDto;
import by.artem.storeapplication.dto.WarehouseResponseDto;
import org.mapstruct.Builder;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring",
        builder = @Builder(disableBuilder = true))
public interface AssortmentMapper {

    AssortmentResponseDto toAssortmentDto(WarehouseResponseDto warehouseResponseDto);
}
