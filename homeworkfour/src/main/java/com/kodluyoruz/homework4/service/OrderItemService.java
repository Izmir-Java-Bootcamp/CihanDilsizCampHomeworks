package com.kodluyoruz.homework4.service;

import com.kodluyoruz.homework4.model.dto.OrderItemDto;
import com.kodluyoruz.homework4.model.entity.OrderItem;
import com.kodluyoruz.homework4.model.request.CreateUpdateOrderItemRequest;
import com.kodluyoruz.homework4.repository.OrderItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.kodluyoruz.homework4.model.mapper.OrderItemMapper.ORDER_ITEM_MAPPER;

@Service
@RequiredArgsConstructor
public class OrderItemService {
    private final OrderItemRepository repository;

    public OrderItemDto createOrderItem( CreateUpdateOrderItemRequest request){
        OrderItem orderItem=ORDER_ITEM_MAPPER.createOrderItem(request);
        return ORDER_ITEM_MAPPER.toOrderItemDto( repository.save(orderItem));
    }
    public void deleteOrderItem(int id){
        repository.deleteById(id);
    }

    public List<OrderItemDto> getAllByOrderId(int orderId){
        return ORDER_ITEM_MAPPER.toOrderItemDtoList(repository.getByOrder_id(orderId));
    }
}
