package com.kodluyoruz.homework.service.payment;

import org.springframework.stereotype.Component;

import com.kodluyoruz.homework.model.checkout.Bill;
import com.kodluyoruz.homework.model.enums.PaymentType;
import com.kodluyoruz.homework.model.properties.CreditCartProperties;

import lombok.Data;

@Data
@Component
public class CreditCart implements Payment {
	private  CreditCartProperties creditCartProperties;
	
	@Override
	public void pay(Bill bill) {
		  double creditCartCommission=creditCartProperties.getCommission();
		  double commission = bill.getTotalPrice() * (creditCartCommission*0.01);
	      double price = bill.getTotalPrice() + commission;
		  
		  System.out.printf("Credit Cart payment completed." +
	                "Commission charge: %s " +
	                "Commision Rate: %s " +
	                "Payment After commission: %s", commission,creditCartCommission, price);
		
	}

	@Override
	public PaymentType getType() {
		return PaymentType.CREDİTCART;
	}

}
