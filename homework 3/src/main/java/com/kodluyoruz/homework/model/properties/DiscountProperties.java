package com.kodluyoruz.homework.model.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;

@Data
@ConfigurationProperties(prefix="discount")
public class DiscountProperties {

	private double percetange;

}
