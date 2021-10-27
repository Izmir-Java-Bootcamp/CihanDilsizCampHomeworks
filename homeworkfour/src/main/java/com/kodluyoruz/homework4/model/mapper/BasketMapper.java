package com.kodluyoruz.homework4.model.mapper;

import com.kodluyoruz.homework4.model.dto.BasketDto;
import com.kodluyoruz.homework4.model.entity.Basket;
import com.kodluyoruz.homework4.model.request.CreateUpdateBasketRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface BasketMapper {
    BasketMapper BASKET_MAPPER= Mappers.getMapper(BasketMapper.class);

    BasketDto toBasketDto(Basket basket);

    List<BasketDto> toBasketDtoList(List<Basket> basketList);

    Basket createBasket(CreateUpdateBasketRequest createUpdateBasketRequest);

    void updateBasket(@MappingTarget Basket basket,CreateUpdateBasketRequest createUpdateBasketRequest);
}
