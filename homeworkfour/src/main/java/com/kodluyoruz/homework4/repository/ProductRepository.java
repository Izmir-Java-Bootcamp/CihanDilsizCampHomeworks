package com.kodluyoruz.homework4.repository;

import com.kodluyoruz.homework4.model.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
}
