package com.kodluyoruz.homework4.contoller;

import com.kodluyoruz.homework4.model.dto.OrderItemDto;
import com.kodluyoruz.homework4.model.request.CreateUpdateOrderItemRequest;
import com.kodluyoruz.homework4.service.OrderItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequiredArgsConstructor
@RequestMapping("orderItems")
public class OrderItemController {
    private final OrderItemService orderItemService;

    @PostMapping
    public OrderItemDto createOrderItem(@RequestBody CreateUpdateOrderItemRequest request) {
        return orderItemService.createOrderItem(request);
    }

    @DeleteMapping("{id}")
    public void deleteOrderItem(@PathVariable int id) {
        orderItemService.deleteOrderItem(id);
    }

    @GetMapping
    public List<OrderItemDto> getAllByOrderId(@RequestParam int orderId) {
        return orderItemService.getAllByOrderId(orderId);
    }
}
