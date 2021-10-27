package com.kodluyoruz.homework4.model.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class CreateUpdateBasketItemRequest {
    private int basketId;
    private int productId;
    private int quantity;
}
