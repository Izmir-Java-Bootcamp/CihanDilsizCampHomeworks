package com.kodluyoruz.homework4.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderItemDto {

    private int id;

    private int orderId;

    private int productId;

    private int quantity;

    private double unitPrice;

}
