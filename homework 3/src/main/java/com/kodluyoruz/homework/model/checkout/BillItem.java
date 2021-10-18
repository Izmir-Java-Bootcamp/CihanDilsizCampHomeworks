package com.kodluyoruz.homework.model.checkout;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BillItem {
	  private String productName;
	  private double price;
	  private double discountedPrice;
	  private int quantity;
	  private String sellerName;
	  private String description;
}
