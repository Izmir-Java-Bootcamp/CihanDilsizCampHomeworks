package com.kodluyoruz.homework.service.payment;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.kodluyoruz.homework.model.enums.PaymentType;

@Service
public class PaymentFactory {
	
	  private final Map<PaymentType, Payment> paymentMap;

	    public PaymentFactory(List<Payment> payments) {
	        this.paymentMap = payments.stream()
	                .collect(Collectors.toMap(Payment::getType, payment -> payment));
	    }

	    public Payment getType(PaymentType type) {
	        return paymentMap.get(type);
	    }
}
