package com.kodluyoruz.homework4.model.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@AllArgsConstructor
@Builder
public class CreateUpdateUserRequest {
    private String name;
    private String surname;
    private String email;
    private String phone;
}
