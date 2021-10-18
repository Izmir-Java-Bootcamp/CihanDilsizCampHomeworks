package com.kodluyoruz.homework.service.payment;

import com.kodluyoruz.homework.model.checkout.Bill;
import com.kodluyoruz.homework.model.enums.PaymentType;

public class Cash implements Payment{



	    @Override
	    public void pay(Bill bill) {
	        System.out.println("Payment completed with cash, Total Price: " + bill.getTotalPrice());
	    }

		@Override
		public PaymentType getType() {
			 
			return PaymentType.CASH;
		}

}
