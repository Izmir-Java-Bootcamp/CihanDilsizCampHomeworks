package com.kodluyoruz.homework4.repository;

import com.kodluyoruz.homework4.model.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order,Integer> {
    List<Order> getAllById(int userId);
}
