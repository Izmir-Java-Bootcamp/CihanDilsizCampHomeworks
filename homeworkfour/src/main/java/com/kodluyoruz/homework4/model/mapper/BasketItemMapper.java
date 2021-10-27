package com.kodluyoruz.homework4.model.mapper;

import com.kodluyoruz.homework4.model.dto.BasketItemDto;
import com.kodluyoruz.homework4.model.entity.BasketItem;
import com.kodluyoruz.homework4.model.request.CreateUpdateBasketItemRequest;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface BasketItemMapper {
    BasketItemMapper BASKET_ITEM_MAPPER= Mappers.getMapper(BasketItemMapper.class);

    BasketItemDto toBasketItemDto(BasketItem basketItem);

    List<BasketItemDto> toBasketItemDtoList(List<BasketItem> basketItemList);

    BasketItem toBasketItem(CreateUpdateBasketItemRequest createUpdateBasketItemRequest);

    void updatBaskketItem(@MappingTarget BasketItem basketItem,CreateUpdateBasketItemRequest createUpdateBasketItemRequest);

}
