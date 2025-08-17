package com.springboot.jpa.service;


import com.springboot.jpa.Dto.ProductDto;
import com.springboot.jpa.Dto.ProductResponseDto;

// 예제 6.21
public interface ProductService {

    ProductResponseDto getProduct(Long number);

    ProductResponseDto saveProduct(ProductDto productDto);

    ProductResponseDto changeProductName(Long number, String name) throws Exception;

    void deleteProduct(Long number) throws Exception;

}