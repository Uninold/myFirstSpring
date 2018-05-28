package com.example.myFirstSpring.dao;

import com.example.myFirstSpring.entity.Cart;
import com.example.myFirstSpring.entity.Products;
import com.example.myFirstSpring.entity.User;

import java.util.List;

/**
 * Created by Arnold on 28 May 2018.
 */
public interface ProductDAO {
    public void saveCart(Cart cart);
    public List<Cart> getUser();
    public List<Products> getProducts();
    public String getRecommendation(String product_name);
}
