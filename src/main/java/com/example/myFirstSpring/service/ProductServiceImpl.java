package com.example.myFirstSpring.service;

import com.example.myFirstSpring.dao.ProductDAO;
import com.example.myFirstSpring.entity.Cart;
import com.example.myFirstSpring.entity.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Arnold on 28 May 2018.
 */
@Service
@Transactional
public class ProductServiceImpl implements ProductService{
    @Autowired
    private ProductDAO productDAO;


    @Override
    public List<Products> getProducts() {
        return productDAO.getProducts();
    }

    @Override
    public void saveCart(Cart cart) {
        productDAO.saveCart(cart);
    }

    @Override
    public List<Cart> getUser() {
        return null;
    }

    @Override
    public String getRecommendation(String product_name) {
        return productDAO.getRecommendation(product_name);
    }


}
