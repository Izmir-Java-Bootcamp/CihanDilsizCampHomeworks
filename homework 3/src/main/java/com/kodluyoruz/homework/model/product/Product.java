package com.kodluyoruz.homework.model.product;

import com.kodluyoruz.homework.model.category.SubCategory;

import lombok.Data;


public class Product   extends SubCategory{
	public String name;
	public String description;
	public int price;


	public Product(String mainCategoryName, String subCategoryName, String name, String description, int price) {
		super(mainCategoryName, subCategoryName);
		this.name = name;
		this.description = description;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString(){
		return "Name: " + name + " Description: " + description + " Price :" + price;
	}






}
