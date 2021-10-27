package com.kodluyoruz.homework4.repository;

import com.kodluyoruz.homework4.model.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Integer> {
}
