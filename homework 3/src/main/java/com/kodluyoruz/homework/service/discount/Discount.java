package com.kodluyoruz.homework.service.discount;

import org.springframework.stereotype.Service;

import com.kodluyoruz.homework.model.cart.Cart;
import com.kodluyoruz.homework.model.cart.CartItem;


@Service
public interface Discount {
	boolean isAcceptable(Cart cart);
	double applyDiscount(CartItem carItem);

}
