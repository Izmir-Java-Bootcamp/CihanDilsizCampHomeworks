package com.kodluyoruz.homework4.service;

import com.kodluyoruz.homework4.model.dto.ProductDto;
import com.kodluyoruz.homework4.model.entity.Product;
import com.kodluyoruz.homework4.model.request.CreateUpdateProductRequest;
import com.kodluyoruz.homework4.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.kodluyoruz.homework4.model.mapper.ProductMapper.PRODUCT_MAPPER;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository repository;

    public ProductDto createProduct(CreateUpdateProductRequest request) {
        Product product = PRODUCT_MAPPER.createProduct(request);

        Product savedProduct = repository.save(product);
        return PRODUCT_MAPPER.toProductDto(savedProduct);
    }


    public ProductDto getProduct(int id) {
        Product product = getProductEntity(id);
        return PRODUCT_MAPPER.toProductDto(product);
    }

    private Product getProductEntity(int id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("not found"));
    }

    public ProductDto updateProduct(int id, CreateUpdateProductRequest request) {
        Product product = getProductEntity(id);
        PRODUCT_MAPPER.updateProduct(product, request);

        Product updatedProduct = repository.save(product);
        return PRODUCT_MAPPER.toProductDto(updatedProduct);
    }

    public void deleteProduct(int id) {
        repository.deleteById(id);
    }


}