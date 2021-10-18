package com.kodluyoruz.homework.service.discount;

import java.util.List;
import java.util.stream.Stream;

import com.kodluyoruz.homework.model.cart.Cart;
import com.kodluyoruz.homework.model.cart.CartItem;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class DiscountStrategy {
	
	private final List<Discount>discounts;
	
	  public double discount(Cart cart,CartItem cartItem) {
		  double price=0;
		  Stream<Discount> discountStream =discounts.stream()
	                .filter(discount -> discount.isAcceptable(cart));
		  			return discountStream
							.findFirst()
							.get().applyDiscount(cartItem);
	    }
}
