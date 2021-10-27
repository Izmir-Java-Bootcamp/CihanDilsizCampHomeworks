package com.kodluyoruz.homework4.repository;

import com.kodluyoruz.homework4.model.entity.Basket;
import org.hibernate.sql.Select;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BasketRepository extends JpaRepository<Basket,Integer> {

    @Modifying(clearAutomatically = true)
    @Query("update #{#entityName} b set b.isActive= false where b.id= :id")
    void makeNotActiveBasket(@Param("id") Integer id);

    Basket getByUser_id(int userId);
    List<Basket> findByUserIdAndIsActiveTrue(int userId);

}
