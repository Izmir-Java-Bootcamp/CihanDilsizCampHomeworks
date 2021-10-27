package com.kodluyoruz.homework4.repository;

import com.kodluyoruz.homework4.model.entity.BasketItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BasketItemRepository extends JpaRepository<BasketItem,Integer> {
    List<BasketItem> getByBasket_id(int basketId);
}
