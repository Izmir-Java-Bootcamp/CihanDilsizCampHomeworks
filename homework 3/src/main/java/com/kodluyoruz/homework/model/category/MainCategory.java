package com.kodluyoruz.homework.model.category;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import java.util.List;
import java.util.ArrayList;

@Data
@RequiredArgsConstructor
 public class MainCategory{
    private final String mainCategoryName;
    private final List<SubCategory> subCategoryList;

    public MainCategory(String categoryName) {
        this.mainCategoryName = categoryName;
        this.subCategoryList = new ArrayList<>();
    }

    public void addSubCategory(SubCategory subCategory){
        subCategoryList.add(subCategory);
    }

    public List<SubCategory> getSubCategoryList(){
        return subCategoryList;
    }

    public String getMainCategoryName() {
        return mainCategoryName;
    }

}
