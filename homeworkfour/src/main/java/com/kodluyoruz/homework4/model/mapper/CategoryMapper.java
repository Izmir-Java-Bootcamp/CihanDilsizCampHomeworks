package com.kodluyoruz.homework4.model.mapper;

import com.kodluyoruz.homework4.model.dto.CategoryDto;
import com.kodluyoruz.homework4.model.entity.Category;
import com.kodluyoruz.homework4.model.request.CreateUpdateCategoryRequest;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

import java.util.List;


@Mapper(componentModel = "spring")
public interface CategoryMapper {
    CategoryMapper CATEGORY_MAPPER = Mappers.getMapper(CategoryMapper.class);

    CategoryDto toCategoryDto(Category category);

    List<CategoryDto> toCategoryDtoList(List<Category> category);

    Category createCategory(CreateUpdateCategoryRequest request);

    void updateProduct(@MappingTarget Category category, CreateUpdateCategoryRequest request);
}

