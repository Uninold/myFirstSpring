package com.example.myFirstSpring.response;

import com.example.myFirstSpring.entity.Products;
import com.example.myFirstSpring.entity.User;

import java.util.List;

/**
 * Created by Arnold on 28 May 2018.
 */
public class ProductListResponse {
    private SystemResponse systemResponse;
    private List<Products> products;

    public ProductListResponse() {
    }

    public ProductListResponse(SystemResponse systemResponse, List<Products> products) {
        this.systemResponse = systemResponse;
        this.products = products;
    }

    public SystemResponse getSystemResponse() {
        return systemResponse;
    }

    public void setSystemResponse(SystemResponse systemResponse) {
        this.systemResponse = systemResponse;
    }

    public List<Products> getProducts() {
        return products;
    }

        public void setProducts(List<Products> products) {
        this.products = products;
    }
}
