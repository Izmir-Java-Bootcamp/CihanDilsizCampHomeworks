package com.kodluyoruz.homework4.repository;

import com.kodluyoruz.homework4.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
