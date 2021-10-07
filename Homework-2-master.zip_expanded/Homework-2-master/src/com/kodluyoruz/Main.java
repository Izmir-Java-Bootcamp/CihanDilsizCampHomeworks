package com.kodluyoruz;

import java.util.Scanner;

public class Main {
    /**
     * This is the main class for the application, interacting
     * with the customer, adding to the cart different products to
     * be purchased and finally calculating the total amount to be paid
     */

    /**
     * Allows a cashier to enter the details for a product
     * to be purchased by a customer
     * @param cart the shopping cart of a given customer
     */
    public static void askCustomer(Cart cart){
        // Code to read from console the product name, seller,
    	Scanner scanner = new Scanner(System.in);
    	
    	 System.out.print("Product name: ");
         String pName = scanner.nextLine();

         System.out.print("Seller: ");
         String seller = scanner.nextLine();

         System.out.print("Price: ");
         double price = scanner.nextDouble();

         System.out.print("How many: ");
         int howMany = scanner.nextInt();

         System.out.print("Discount (enter 0 if no discount applies): ");
         int discount = scanner.nextInt();


         System.out.print("Does Buy2Take3 apply? Y/N: ");
         String buy2take3 =scanner.next();

     
    	Product product; 
    	
    	  	
    	if(discount>0&&buy2take3.equals("N")) {
    		product=new Product(pName,seller,price);
    		DiscountedProduct bt=new DiscountedProduct(product,discount);
    		cart.addProduct(bt,howMany);
    	}
    	else if(discount==0&&buy2take3.equals("Y")) {
    		product=new Product(pName,seller,price);
    		Buy2Take3Product bt2=new Buy2Take3Product(product);
        	cart.addProduct(bt2,howMany);   	
    	}else {
    		throw new IllegalArgumentException("You can not use both campaign");
    	}
        // price, number of products, discount and
        // if Buy2Take3 applies.
        // Then create a product of the correct type
        // and add it to the  cart
    }

    // Main method to interact with a customer
    public static void main(String[] args) {
        System.out.println("Welcome to kodluyoruz shop");
        System.out.println("What's your name?");

        Scanner scanner = new Scanner(System.in);

        String customer = scanner.nextLine();
        Cart cart = new Cart();
        System.out.println("Hi " + customer + ". Please choose one of the following options:");
        while(true) {
     
        System.out.println("Enter 1 to buy a product");
        System.out.println("Enter 0 to chechout and proceed with the payment");
        String input=scanner.nextLine();
        if(input.equals("1")) {
       
        askCustomer(cart);
        }else {
        	System.out.println(cart.toString());
        	return;
        	
        }
        //Implement the user interface 
        // Ask the user to choose 0 (buy product) or
        // 1 (checkout), depending on what they want to do.
        // Use the method askCustomer
        }
    }
}
