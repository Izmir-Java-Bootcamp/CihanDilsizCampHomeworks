package com.kodluyoruz.homework4.contoller;

import com.kodluyoruz.homework4.model.dto.CheckoutDto;
import com.kodluyoruz.homework4.model.dto.OrderDto;
import com.kodluyoruz.homework4.service.CheckoutService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("checkouts")
public class CheckoutController {
    private final CheckoutService checkoutService;

    @GetMapping("{userId}")
    public CheckoutDto getActiveBasketItems(@PathVariable int userId) {
        return checkoutService.getActiveBasketItems(userId);
    }

    @PostMapping
    public OrderDto createOrder(@RequestParam int userId) {

        return checkoutService.createOrder(userId);
    }
}