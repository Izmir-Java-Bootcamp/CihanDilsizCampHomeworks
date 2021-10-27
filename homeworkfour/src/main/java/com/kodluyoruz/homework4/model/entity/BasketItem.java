package com.kodluyoruz.homework4.model.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Min;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Table(name = "basket_items")

public class BasketItem extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column (name="basket_id")
    private Integer basketId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "basket_id",insertable = false,updatable = false,nullable = false)
    private Basket basket;

    @Column(name="productId")
    private Integer productId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="productId",insertable = false,updatable = false,nullable = false)
    private Product product;

    @Column(nullable = false)
    private Integer quantity;

    @Min(1)
    @Column(nullable = false)
    private double unitPrice;

}
