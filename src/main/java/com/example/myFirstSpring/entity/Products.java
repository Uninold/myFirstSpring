package com.example.myFirstSpring.entity;

import javax.persistence.*;

/**
 * Created by Arnold on 28 May 2018.
 */
@Entity
@Table(name = "products")
public class Products {
    //primary key
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "product_name")
    private String product_name;
    @Column(name = "product_description")
    private  String product_description;
    @Column(name = "price")
    private  double price;

    public Products(){}

    public Products(String product_name, String product_description, double price) {
        this.product_name = product_name;
        this.product_description = product_description;
        this.price = price;
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

    public String getProduct_description() {
        return product_description;
    }

    public void setProduct_description(String product_description) {
        this.product_description = product_description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public String giveRecommendation(String recommended){
        System.out.println(recommended);
        String service = "";
        if(recommended.equalsIgnoreCase("Sangot"))
        {
            service = "Pahait Service";
        }
        else if(recommended.equalsIgnoreCase("Luthang"))
        {
            service = "Reload Holy Bullets Service";
        }
        else if(recommended.equalsIgnoreCase("Hanger ni Mama"))
        {
            service = "Armament Haki Hanger Service";
        }
        return service;
    }
}
