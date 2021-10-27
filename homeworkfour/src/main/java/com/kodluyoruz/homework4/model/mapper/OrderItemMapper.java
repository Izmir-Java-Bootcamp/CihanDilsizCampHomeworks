package com.kodluyoruz.homework4.model.mapper;

import com.kodluyoruz.homework4.model.dto.OrderItemDto;
import com.kodluyoruz.homework4.model.entity.OrderItem;
import com.kodluyoruz.homework4.model.request.CreateUpdateOrderItemRequest;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

import java.util.List;

public interface OrderItemMapper {
    OrderItemMapper ORDER_ITEM_MAPPER = Mappers.getMapper(OrderItemMapper.class);

    OrderItemDto toOrderItemDto(OrderItem orderItem);

    List<OrderItemDto> toOrderItemDtoList(List<OrderItem> orderItemList);

    OrderItem createOrderItem(CreateUpdateOrderItemRequest request);

    void updateProduct(@MappingTarget OrderItem orderItem, CreateUpdateOrderItemRequest request);
}

