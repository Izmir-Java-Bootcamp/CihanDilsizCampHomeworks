package com.kodluyoruz.homework.model.cart;

import com.kodluyoruz.homework.model.product.Product;
import com.kodluyoruz.homework.service.discount.Discount;

import lombok.Data;
@Data
public class CartItem {
	  	private Product product;
	    private int quantity;

	    public double getPrice() {
	        return product.getPrice() * quantity;
	    }

	 
	    
}
