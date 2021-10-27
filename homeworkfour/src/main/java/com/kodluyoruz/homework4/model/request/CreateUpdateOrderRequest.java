package com.kodluyoruz.homework4.model.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CreateUpdateOrderRequest {
    private int userId;
    private double totalPaidPrice;
}
