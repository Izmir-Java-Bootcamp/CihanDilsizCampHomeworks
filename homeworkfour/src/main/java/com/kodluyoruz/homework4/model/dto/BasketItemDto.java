package com.kodluyoruz.homework4.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BasketItemDto {
    private int id;
    private int basketId;
    private int productId;
    private int quantity;
}
