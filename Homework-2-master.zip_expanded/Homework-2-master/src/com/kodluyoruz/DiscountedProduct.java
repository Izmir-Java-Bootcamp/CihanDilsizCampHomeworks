package com.kodluyoruz;

import java.util.List;

/**
 * Subclass representing a discounted product to be
 * purchased. It extends the Product class with two instance variables
 */
public class DiscountedProduct extends Product {
    // Original product
    private final Product original;

    // Discount in percent (%)
    private final double discount;

    /**
     * Construct a discounted product
     * @param original
     * @param discount
     */
    public DiscountedProduct(Product original, double discount) {
        // if the price can not be reduced you should print a message and
        // terminate the program. Use IllegalArgumentException to terminate.
        // code here
    	super(original);
    	 
    	this.discount=discount;
    	this.original=original;
    }

    /**
     * Return the price of this discounted product
     * @param cart shopping cart
     * @return discounted price
     */
    public double getPrice(Cart cart) {
    	double price=0;
    	for(Product product:cart.getProducts()) {
      		if(product instanceof DiscountedProduct) {
      			 price =product.getPrice()*(100-this.discount)/100;
      		}
    	 
    	}
        return price;
    
    }

    /**
     * Return the string representation of the product
     * Example: CD [discounted 20 %]
     */
    public String toString() {
        return this.getName()+ "[discounted by "+this.discount+"  %]";
    }
}
