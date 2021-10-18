package com.kodluyoruz.homework.service.discount;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.kodluyoruz.homework.model.cart.Cart;
import com.kodluyoruz.homework.model.cart.CartItem;
import com.kodluyoruz.homework.model.properties.DiscountProperties;

@Component
@Order(Ordered.HIGHEST_PRECEDENCE)
public class PercentageDiscount implements Discount {
	
	private DiscountProperties discountProperties;
	
	@Override
	public double applyDiscount(CartItem cartItem) {
		 
		 	double price = cartItem.getProduct().getPrice() * cartItem.getQuantity();
	        double appliedDiscount = price * discountProperties.getPercetange();
	        return price - appliedDiscount;
	}

	@Override
	public boolean isAcceptable(Cart cart) {
		double totalPrice=cart.getCartItems().stream()
				.map(CartItem::getPrice)
				.mapToDouble(d->d)
				.sum();
				         
		return  totalPrice>=1000 ;
	}

	 
}
