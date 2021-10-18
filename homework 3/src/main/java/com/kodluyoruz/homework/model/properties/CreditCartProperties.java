package com.kodluyoruz.homework.model.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;

@Data
@ConfigurationProperties(prefix="credit-cart")

public class CreditCartProperties {
	private double commission;

}
