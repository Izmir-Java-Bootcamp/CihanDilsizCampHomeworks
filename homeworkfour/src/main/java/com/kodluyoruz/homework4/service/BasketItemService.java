package com.kodluyoruz.homework4.service;

import com.kodluyoruz.homework4.model.dto.BasketItemDto;
import com.kodluyoruz.homework4.model.entity.Basket;
import com.kodluyoruz.homework4.model.entity.BasketItem;
import com.kodluyoruz.homework4.model.request.CreateUpdateBasketItemRequest;
import com.kodluyoruz.homework4.repository.BasketItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.kodluyoruz.homework4.model.mapper.BasketItemMapper.BASKET_ITEM_MAPPER;

@Service
@RequiredArgsConstructor
public class BasketItemService {
    private final BasketItemRepository repository;

    public BasketItemDto createBasketItem(int basketId, CreateUpdateBasketItemRequest request){
        BasketItem basketItem=BASKET_ITEM_MAPPER.toBasketItem(request);
        return BASKET_ITEM_MAPPER.toBasketItemDto(repository.save(basketItem));
    }
    public void deleteBasketItem(int id){
        repository.deleteById(id);
    }

    public List<BasketItemDto> getAllByBasketId(int basketId){
        return BASKET_ITEM_MAPPER.toBasketItemDtoList(repository.getByBasket_id(basketId));
    }
    public List<BasketItem> getByBasketId(int basketId){
        return repository.getByBasket_id(basketId);
    }









}
