package com.kodluyoruz.homework.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Service;

import com.kodluyoruz.homework.model.cart.Cart;
import com.kodluyoruz.homework.model.checkout.Bill;
import com.kodluyoruz.homework.model.checkout.BillItem;
import com.kodluyoruz.homework.service.discount.DiscountStrategy;

import lombok.Data;


@Service
@ConfigurationProperties(prefix = "discount")
@Data
public class CheckoutService {
	 	private int deliveryFee;
	    private int deliveryFeeLimit;
	    private final DiscountStrategy discountStrategy;
	    
	    public Bill checkout(Cart cart) {
	    	List<BillItem> billItems = cart.getCartItems()
	                .stream()
	                .map(cartItem -> BillItem.builder()

	                        .productName(cartItem.getProduct().getName())
	                        .quantity(cartItem.getQuantity())
	                        .price(cartItem.getPrice())
	                        .description(cartItem.getProduct().getDescription())
	                        .discountedPrice(discountStrategy.discount(cart,cartItem))
	                        .build())
	                .collect(Collectors.toList());

	        double totalSum = billItems.stream()
	                .map(BillItem::getDiscountedPrice)
	                .mapToDouble(d -> d)
	                .sum();

	        if(totalSum==0){
	            totalSum= cart.getTotalPrice();
	        }
	        if(totalSum<deliveryFeeLimit){
	            totalSum=totalSum+deliveryFee;
	        }

	        return Bill.builder()
	                .billItems(billItems)
	                .totalPrice(totalSum)
	                .build();
	    }
}
