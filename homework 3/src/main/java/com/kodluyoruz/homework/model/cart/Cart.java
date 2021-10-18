package com.kodluyoruz.homework.model.cart;

import java.util.ArrayList;
import java.util.List;


public class Cart {
	 private final List<CartItem> cartItems;

	    public Cart() {
	        this.cartItems = new ArrayList<>();
	    }

	    public void addItem(CartItem cartItem) {
	        cartItems.add(cartItem);
	    }

	    public List<CartItem> getCartItems() {
	        return cartItems;
	    }

		public double getTotalPrice(){
			return cartItems.stream().map(CartItem::getPrice).mapToDouble(value -> value).sum();
	}
}
