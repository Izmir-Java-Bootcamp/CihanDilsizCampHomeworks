package com.kodluyoruz.homework.service.payment;

import com.kodluyoruz.homework.model.checkout.Bill;
import com.kodluyoruz.homework.model.enums.PaymentType;

public interface Payment {
	void pay(Bill bill);
	PaymentType getType();
	
}
