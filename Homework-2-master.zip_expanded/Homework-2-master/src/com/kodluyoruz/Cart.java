package com.kodluyoruz;

import java.util.ArrayList;
import java.util.List;

/**
 * Class representing the shopping cart
 */

public class Cart {
    // list of products
    private final List<Product> products;

    public Cart(){
        products = new ArrayList<>();
    }

    /**
     * Return the list of products
     * @return
     */
    public List<Product> getProducts(){
        // code here
    	return this.products;
    }

    /**
     * Add a product to the list
     * @param product
     */
    public void addProduct(Product product) {
       this.products.add(product);
    }

    /**
     * Add an list of products to the list
     *  @param products
     */
    public void addProducts(List<Product> products) {
         for(int i=0;i<products.size();i++) {
        	 this.products.add(products.get(i));
         }
    }

    /**
     * Adds a product several times
     * @param product
     * @param howManyTimes number of times to add product
     */
    public void addProduct(Product product, int howManyTimes) {
        // code here
    	for(int i=0;i<howManyTimes;i++) {
    		this.products.add(product);
    	}
    }

    /**
     * Calculate the total price
     * @return
     */
    public double totalPrice(){
        // code here
    	double totalPrice=0;
    	 for(Product product:this.getProducts()) {
     		if(product instanceof Buy2Take3Product) {
     			totalPrice+=product.getPrice(this);
     		}else {
     			totalPrice+=product.getPrice(this);
     		}
     	}
    	return totalPrice;
    }

    /**
     * String representation of products in a shopping cart
     * Example:
     * CD of Teoman 22.50 TL. Sold by Berk
     * TV [discounted by 20.00%] 4000.00 TL. Sold by Merve
     */
    public String toString() {
        String result = "";
        for(Product product:this.getProducts()) {
    		if(product instanceof Buy2Take3Product) {
    			result+=product.getName()+" "+product.getPrice(this)+" TL. Sold by "+product.getSeller()+"\n";
    		}else {
    			result+=product.toString()+" "+product.getPrice(this)+" TL. Sold by "+product.getSeller()+"\n";
    		}
    	}
        result+="In total you have to pay"+	this.totalPrice();
        return result;
    }
}

