package com.kodluyoruz.homework4.repository;

import com.kodluyoruz.homework4.model.entity.Checkout;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CheckoutRepository extends JpaRepository<Checkout,Integer> {
}
