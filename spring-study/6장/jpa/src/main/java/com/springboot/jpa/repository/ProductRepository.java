package com.springboot.jpa.repository;


import com.springboot.jpa.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;


// 예제 6.7
public interface ProductRepository extends JpaRepository<Product, Long> {

}

