package org.example.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "ORDERS")
public class Orders {

    @Id
    @Column(name = "ID")
    private Long id;

    /**
     * ERD 표기 그대로 ORDER_ID(FK)
     * (관계선상 MEMBER를 참조하는 FK로 해석)
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ORDER_ID")
    private Member member;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PRODUCT_ID")
    private Product product;

    @Column(name = "ORDERAMOUNT")
    private Integer orderAmount;

    @Column(name = "CITY")
    private String city;

    @Column(name = "STREET")
    private String street;

    @Column(name = "ZIPCODE")
    private String zipcode;

    protected Orders() {}

    public Long getId() { return id; }
    public Member getMember() { return member; }
    public Product getProduct() { return product; }
    public Integer getOrderAmount() { return orderAmount; }
    public String getCity() { return city; }
    public String getStreet() { return street; }
    public String getZipcode() { return zipcode; }
}
