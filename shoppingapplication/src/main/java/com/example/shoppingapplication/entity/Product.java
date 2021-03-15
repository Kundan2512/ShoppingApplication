package com.example.shoppingapplication.entity;

import javax.persistence.*;

@Entity
@Table(name="product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer product_id;
    String product_name;
    Integer quantity;
    Integer rate;
    public Product(){}
    public Product(Integer product_id, String product_name, Integer quantity, Integer rate)
    {
        this.product_id=product_id;
        this.product_name=product_name;
        this.quantity=quantity;
        this.rate=rate;
    }

    public Integer getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Integer product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getRate() {
        return rate;
    }

    public void setRate(Integer rate) {
        this.rate = rate;
    }
}
