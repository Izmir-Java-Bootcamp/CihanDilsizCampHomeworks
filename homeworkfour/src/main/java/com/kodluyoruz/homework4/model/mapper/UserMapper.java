package com.kodluyoruz.homework4.model.mapper;

import com.kodluyoruz.homework4.model.dto.UserDto;
import com.kodluyoruz.homework4.model.entity.User;
import com.kodluyoruz.homework4.model.request.CreateUpdateUserRequest;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserMapper USER_MAPPER = Mappers.getMapper(UserMapper.class);

    UserDto toProductDto(User user);

    List<UserDto> toProductDtoList(List<User> products);

    User createProduct(CreateUpdateUserRequest request);

    void updateUser(@MappingTarget User user, CreateUpdateUserRequest request);
}