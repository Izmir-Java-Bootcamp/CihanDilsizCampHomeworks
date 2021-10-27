package com.kodluyoruz.homework4.model.dto;

import com.kodluyoruz.homework4.model.entity.BasketItem;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CheckoutDto {
    private int userId;
    private int basketId;
    private List<BasketItem> basketItemList;

}
