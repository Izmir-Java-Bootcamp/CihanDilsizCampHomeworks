package com.kodluyoruz.homework.model.category;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Data
public class Category {
    private final List<MainCategory> mainCategoryList;

    public Category() {
        this.mainCategoryList = new ArrayList<>();
    }

    public void addCategory(MainCategory mainCategory) {
        mainCategoryList.add(mainCategory);
    }

    public List<MainCategory> getMainCategoryList() {
        return mainCategoryList;
    }
}
