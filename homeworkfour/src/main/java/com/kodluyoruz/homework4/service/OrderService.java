package com.kodluyoruz.homework4.service;

import com.kodluyoruz.homework4.model.dto.OrderDto;
import com.kodluyoruz.homework4.model.entity.Order;
import com.kodluyoruz.homework4.model.request.CreateUpdateOrderRequest;
import com.kodluyoruz.homework4.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.kodluyoruz.homework4.model.mapper.OrderMapper.ORDER_MAPPER;

@Service
@RequiredArgsConstructor
public class OrderService {
    private final OrderRepository repository;

    public OrderDto createOrder(CreateUpdateOrderRequest request){
        Order order=ORDER_MAPPER.createOrder(request);
        return  ORDER_MAPPER.toOrderDto(repository.save(order));
    }
    public List<OrderDto> getAllOrderByUserId(int userId){
        List<Order> orderList=repository.getAllById(userId);
        return ORDER_MAPPER.toOrderDtoList(orderList);
    }
    public OrderDto getOrderById(int orderId){
         Order order=repository.findById(orderId).orElseThrow(()->new RuntimeException());
         return ORDER_MAPPER.toOrderDto(order);
    }
}
