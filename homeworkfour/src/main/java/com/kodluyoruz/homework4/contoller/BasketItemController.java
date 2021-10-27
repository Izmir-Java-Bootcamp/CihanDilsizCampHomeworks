package com.kodluyoruz.homework4.contoller;

import com.kodluyoruz.homework4.model.dto.BasketItemDto;
import com.kodluyoruz.homework4.model.entity.BasketItem;
import com.kodluyoruz.homework4.model.request.CreateUpdateBasketItemRequest;
import com.kodluyoruz.homework4.service.BasketItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequiredArgsConstructor
@RequestMapping("basketsItems")
public class BasketItemController {
    private final BasketItemService basketItemService;

    @PostMapping
    public BasketItemDto createBasketItem(@RequestParam int basketId, @RequestBody CreateUpdateBasketItemRequest request) {
       return basketItemService.createBasketItem(basketId,request);
    }
    @DeleteMapping
    public void deleteBasketItem( @RequestParam int id){
        basketItemService.deleteBasketItem(id);
    }
    @GetMapping("{basketId}")
    public List<BasketItemDto> getAllByBasketId(@RequestParam int basketId){
        return basketItemService.getAllByBasketId(basketId);
    }
    @GetMapping()
    public List<BasketItem> getByBasketId( @RequestParam int basketId){
        return basketItemService.getByBasketId(basketId);
    }

}
