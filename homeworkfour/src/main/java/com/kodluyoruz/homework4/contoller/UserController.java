package com.kodluyoruz.homework4.contoller;

import com.kodluyoruz.homework4.model.dto.UserDto;
import com.kodluyoruz.homework4.model.request.CreateUpdateUserRequest;
import com.kodluyoruz.homework4.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("users")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService ;

    @GetMapping
    public List<UserDto> getAllUser(){
        return userService.getAll();
    }
    @GetMapping("{id}")
    public UserDto getUserById(@PathVariable int id){
        return userService.getById(id);
    }
    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteUser(@PathVariable int id){
         userService.delete(id);
    }
    @PutMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public UserDto updateUser(@PathVariable int id, @RequestBody  CreateUpdateUserRequest request){
        return userService.updateUser(id,request);
    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public UserDto createUser(@RequestBody  CreateUpdateUserRequest request){
        return userService.createUser(request);
    }


}
