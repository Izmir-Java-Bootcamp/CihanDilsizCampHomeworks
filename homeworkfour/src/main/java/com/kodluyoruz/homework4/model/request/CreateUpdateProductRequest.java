package com.kodluyoruz.homework4.model.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class CreateUpdateProductRequest {
    private String name;
    private String description;
    private Double price;
    private Integer categoryId;
}
