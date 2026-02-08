package org.example.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "PRODUCT")
public class Product {

    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "PRICE")
    private Integer price;

    @Column(name = "STOCKAMOUNT")
    private Integer stockAmount;

    protected Product() {}

    public Long getId() { return id; }
    public String getName() { return name; }
    public Integer getPrice() { return price; }
    public Integer getStockAmount() { return stockAmount; }
}