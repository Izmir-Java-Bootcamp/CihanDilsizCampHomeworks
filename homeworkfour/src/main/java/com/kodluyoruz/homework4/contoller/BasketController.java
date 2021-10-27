package com.kodluyoruz.homework4.contoller;

import com.kodluyoruz.homework4.model.dto.BasketDto;
import com.kodluyoruz.homework4.model.entity.Basket;
import com.kodluyoruz.homework4.model.request.CreateUpdateBasketRequest;
import com.kodluyoruz.homework4.service.BasketService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("baskets")
public class BasketController {
    private final BasketService basketService;

    @PostMapping
    public BasketDto createBasket(@RequestBody CreateUpdateBasketRequest request){

        return basketService.createBasket(request);
    }
    @DeleteMapping("{id}")
    public void deleteBasket( @PathVariable int id){
        basketService.delete(id);
    }
    @GetMapping("{id}")
    public Basket getActiveBasket(@PathVariable int userId){
        return basketService.getActiveBasket(userId);
    }
    @PutMapping
    public void makeNotActiveBasket(@RequestParam int id){
        basketService.makeNotActiveBasket(id);
    }
}
