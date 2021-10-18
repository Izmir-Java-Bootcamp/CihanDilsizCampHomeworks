package com.kodluyoruz.homework.model.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;

@Data
@ConfigurationProperties(prefix="delivery")
public class DeliveryProperties {
	private int fee;
	private int feeLimit;

}
