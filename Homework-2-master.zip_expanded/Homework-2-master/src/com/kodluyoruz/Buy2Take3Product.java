 package com.kodluyoruz;

import java.util.List;

/**
 * Subclass representing a product to be purchased
 * (using the formula "buy 2 take 3")
 * It extends the Product class with one instance variable
 */

public class Buy2Take3Product extends Product {
    //original product
    private final Product original;

    /**
     * Construct a Buy2Take3 product
     * If the price of this product can not be reduced
     * you should print a message to the user and terminate the
     * program
     * @param original
     */
    public Buy2Take3Product(Product original) {
        // if the price can not be reduced you should print a message and
        // terminate the program. Use IllegalArgumentException to terminate.
        // code here
    	super(original);
    	this.original=original;
    	if(canBeReduced()) {
    		throw new IllegalArgumentException("You cannot discount if you pay 2 take 3");
    	}
     
    }

    /**
     * Return false if the product price can not be
     * reduced
     * @return
     */
    public boolean canBeReduced() {
        // You can not discount the price of Buy2Take3 product
        // code here
           		return this.original.getPrice()<=0;
          	}
          		
  

    /**
     * Return the unit price of a product using the
     * formula "Buy2Take3"
     * @param cart shopping cart
     * @return unit price
     */
    public double getPrice(Cart cart) {
        // calculate unit price of this product purchased
        // as Buy2Take3
        // code here
    	int howMany=0;
    	double price=0;
        for(Product product:cart.getProducts()) {
          	if(product instanceof Buy2Take3Product) {
          		howMany++;
          		price+=product.getPrice();
          	}
        }
        if(howMany>=3){   
        double discount= howMany/3;
        discount=discount*(price/howMany);
        price-=discount;
        price/=howMany;
        }
        return price;
        
    }
    	
    
}
