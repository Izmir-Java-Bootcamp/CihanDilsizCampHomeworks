package com.kodluyoruz.homework4.contoller;

import com.kodluyoruz.homework4.model.dto.OrderDto;
import com.kodluyoruz.homework4.model.request.CreateUpdateOrderRequest;
import com.kodluyoruz.homework4.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequiredArgsConstructor
@RequestMapping("orders")
public class OrderController {
    private final OrderService orderService;

    @PostMapping
    public OrderDto createOrder(@RequestBody CreateUpdateOrderRequest request){
        return  orderService.createOrder(request) ;
    }
    @GetMapping("{userId}")
    public List<OrderDto> getAllOrderByUserId(@PathVariable int userId){
        return orderService.getAllOrderByUserId(userId);
    }
    @GetMapping("{id}")
    public OrderDto getOrderById(@PathVariable int orderId){
        return orderService.getOrderById(orderId);
    }
}
