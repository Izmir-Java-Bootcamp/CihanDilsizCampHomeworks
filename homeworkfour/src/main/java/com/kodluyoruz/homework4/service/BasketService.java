package com.kodluyoruz.homework4.service;

import com.kodluyoruz.homework4.model.dto.BasketDto;
import com.kodluyoruz.homework4.model.entity.Basket;
import com.kodluyoruz.homework4.model.request.CreateUpdateBasketRequest;
import com.kodluyoruz.homework4.repository.BasketRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.kodluyoruz.homework4.model.mapper.BasketMapper.BASKET_MAPPER;

@Service
@RequiredArgsConstructor
public class BasketService {
    private final BasketRepository repository;

    public BasketDto createBasket(CreateUpdateBasketRequest request){
        if(repository.findByUserIdAndIsActiveTrue(request.getUserId()).size()>0){
            throw new RuntimeException("There is Active Basket For User ");
        }
        Basket basket=BASKET_MAPPER.createBasket(request);
        return BASKET_MAPPER.toBasketDto(repository.save(basket));
    }
    public void delete(int id){repository.deleteById(id);}

    public  Basket  getActiveBasket(int userId){
        return repository.findByUserIdAndIsActiveTrue(userId)
                .stream()
                .findFirst()
                .orElseThrow(()->new RuntimeException("There is no active basket for this user"));

    }


    public void makeNotActiveBasket(int id){
        repository.makeNotActiveBasket(id);
    }

}
