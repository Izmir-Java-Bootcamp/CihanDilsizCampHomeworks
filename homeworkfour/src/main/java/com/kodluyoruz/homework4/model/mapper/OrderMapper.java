package com.kodluyoruz.homework4.model.mapper;

import com.kodluyoruz.homework4.model.dto.OrderDto;
import com.kodluyoruz.homework4.model.entity.Order;
import com.kodluyoruz.homework4.model.request.CreateUpdateOrderRequest;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface OrderMapper {
    OrderMapper ORDER_MAPPER = Mappers.getMapper(OrderMapper.class);

    OrderDto toOrderDto(Order order);

    List<OrderDto> toOrderDtoList(List< Order> orderList);

    Order createOrder(CreateUpdateOrderRequest request);

    void updateProduct(@MappingTarget Order order, CreateUpdateOrderRequest request);
}

