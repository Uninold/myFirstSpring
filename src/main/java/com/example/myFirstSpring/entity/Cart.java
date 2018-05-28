package com.example.myFirstSpring.entity;

import javax.persistence.*;

/**
 * Created by Arnold on 28 May 2018.
 */
@Entity
@Table(name="cart")
public class Cart {
    //primary key
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "product_name")
    private String product_name;

    @Column(name = "product_price")
    private  String product_price;

    @Column(name = "quantity")
    private String quantity;

    public Cart(){}

    public Cart(String product_name, String product_price, String quantity) {
        this.product_name = product_name;
        this.product_price = product_price;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getProduct_price() {
        return product_price;
    }

    public void setProduct_price(String product_price) {
        this.product_price = product_price;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
}
