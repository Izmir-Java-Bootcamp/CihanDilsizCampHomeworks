package com.kodluyoruz.homework4.service;

import com.kodluyoruz.homework4.model.dto.UserDto;
import com.kodluyoruz.homework4.model.entity.User;
import com.kodluyoruz.homework4.model.mapper.UserMapper;
import com.kodluyoruz.homework4.model.request.CreateUpdateUserRequest;
import com.kodluyoruz.homework4.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.kodluyoruz.homework4.model.mapper.UserMapper.USER_MAPPER;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository repository;

    public UserDto createUser(CreateUpdateUserRequest request){
        User user=USER_MAPPER.createProduct(request);
        return USER_MAPPER.toProductDto(repository.save(user));
    }

    public List<UserDto> getAll(){

        return USER_MAPPER.toProductDtoList(repository.findAll());
    }

    public void delete(int id){
        repository.deleteById(id);
    }

    public UserDto updateUser(int id,CreateUpdateUserRequest request){
        User user=repository.findById(id).orElseThrow(()->new RuntimeException());
        USER_MAPPER.updateUser(user,request);
        User updatedUser=repository.save(user);
        return  USER_MAPPER.toProductDto(updatedUser);
    }
    public UserDto getById(int id){
        User user=repository.findById(id).orElseThrow(()-> new RuntimeException());
        return  USER_MAPPER.toProductDto(user);

    }


}
