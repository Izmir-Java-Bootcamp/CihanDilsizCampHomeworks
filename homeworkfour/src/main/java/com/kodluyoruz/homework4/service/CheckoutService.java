package com.kodluyoruz.homework4.service;


import com.kodluyoruz.homework4.model.dto.CheckoutDto;
import com.kodluyoruz.homework4.model.dto.OrderDto;
import com.kodluyoruz.homework4.model.entity.Basket;
import com.kodluyoruz.homework4.model.entity.BasketItem;
import com.kodluyoruz.homework4.model.request.CreateUpdateOrderItemRequest;
import com.kodluyoruz.homework4.model.request.CreateUpdateOrderRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CheckoutService {
    private final BasketService basketService;
    private final BasketItemService basketItemService;
    private final OrderService orderService;
    private final OrderItemService orderItemService;

    public CheckoutDto getActiveBasketItems(int userId){
        Basket basket = getBasket(userId);
        List<BasketItem> basketItemList = getBasketItemList(basket);
        return CheckoutDto.builder()
                .basketId(basket.getId())
                .userId(userId)
                .basketItemList(basketItemList)
                .build();
    }

    public OrderDto createOrder(int userId){
        Basket basket = getBasket(userId);

        List<BasketItem> basketItemList = getBasketItemList(basket);

        double totalPaidPrice=basketItemList
                .stream()
                .mapToDouble(t-> t.getUnitPrice()*t.getQuantity())
                .sum();

        CreateUpdateOrderRequest request= CreateUpdateOrderRequest.builder()
                .userId(userId)
                .totalPaidPrice(totalPaidPrice)
                .build();

        OrderDto order=orderService.createOrder(request);

        for (BasketItem b:basketItemList){
                orderItemService.createOrderItem(CreateUpdateOrderItemRequest.builder()
                    .orderId(order.getId())
                    .productId(b.getProductId())
                    .quantity(b.getQuantity())
                    .unitPrice(b.getUnitPrice())
                    .build());

        }
        basketService.makeNotActiveBasket(basket.getId());
        return order;

    }




    public List<BasketItem> getBasketItemList(Basket basket) {
        List<BasketItem> basketItemList=basketItemService.getByBasketId(basket.getId());
        return basketItemList;
    }

    public Basket getBasket(int userId) {
        Basket basket=basketService.getActiveBasket(userId);
        return basket;
    }


}
