package com.kodluyoruz.homework4.contoller;


import com.kodluyoruz.homework4.model.dto.ProductDto;
import com.kodluyoruz.homework4.model.request.CreateUpdateProductRequest;
import com.kodluyoruz.homework4.service.ProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("products")
@RequiredArgsConstructor
@Slf4j
public class ProductController {
    private final ProductService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ProductDto createProduct(@RequestBody CreateUpdateProductRequest request) {
        return service.createProduct(request);
    }

    @GetMapping("{id}")
    public ProductDto getProduct(@PathVariable int id) {
        return service.getProduct(id);
    }

    @PutMapping("{id}")
    public ProductDto updateProduct(@PathVariable int id, @RequestBody CreateUpdateProductRequest request) {
        return service.updateProduct(id, request);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteProduct(@PathVariable int id) {
        service.deleteProduct(id);
    }


}