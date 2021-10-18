package com.kodluyoruz.homework.service.discount;

import org.springframework.stereotype.Component;

import com.kodluyoruz.homework.model.cart.Cart;
import com.kodluyoruz.homework.model.cart.CartItem;


@Component

public class Buy2Take3 implements Discount {

	@Override
	public double applyDiscount(CartItem cartItem) {
		int discountQuantity = cartItem.getQuantity() / 3;
        int paidQuantity = cartItem.getQuantity() - discountQuantity;
        return paidQuantity * cartItem.getProduct().getPrice();
	}

	@Override
	public boolean isAcceptable(Cart cart) {
		 
	    int value=cart.getCartItems()
	    		 .stream()
	    		 .map(CartItem::getQuantity)
	    		 .max(Integer::compare).get();
	    		 
	     return value>2;
	}

}
