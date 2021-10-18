package com.kodluyoruz.homework.model.category;

import com.kodluyoruz.homework.model.product.Product;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import java.util.List;
import java.util.ArrayList;


public class SubCategory extends MainCategory {


	private final String subCategoryName;
	private final List<Product> productList;


	public SubCategory(String mainCategoryName, String subCategoryName) {
		super(mainCategoryName);
		this.subCategoryName = subCategoryName;
		this.productList = new ArrayList<>();
	}

	public void addProduct(Product product){
		productList.add(product);
	}

	public List<Product> getProductList(){
		return productList;
	}

	public String getSubCategoryName() {
		return subCategoryName;
	}

}
