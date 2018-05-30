package com.example.myFirstSpring.controller;

import com.example.myFirstSpring.entity.Cart;
import com.example.myFirstSpring.entity.Products;
import com.example.myFirstSpring.entity.User;
import com.example.myFirstSpring.model.ProductExpert;
import com.example.myFirstSpring.response.ProductListResponse;
import com.example.myFirstSpring.response.SystemMessage;
import com.example.myFirstSpring.response.SystemResponse;
import com.example.myFirstSpring.service.ProductService;
import com.example.myFirstSpring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * Created by jiptc22 on 5/16/2018.
 */
@RestController
public class ProductsController {
    @Autowired
    private ProductService productService;


    @RequestMapping(value = "/cart",
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public SystemMessage buyout(
            @RequestBody Cart cart,
            Products products
    ){
        productService.saveCart(cart);
        String service = productService.getRecommendation(cart.getProduct_name());
        System.out.println("arnold" + service);
        products.giveRecommendation(service);
        System.out.println("agura" + products.giveRecommendation(service));
        return new SystemMessage(true, products.giveRecommendation(service));
    }

    @RequestMapping(value = "/productList",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ProductListResponse getCustomers(){
        ProductListResponse clr = new ProductListResponse();

        //fetching all customers found on the database.
        clr.setProducts(productService.getProducts());

        //assuming all transactions are successful.
        SystemResponse systemResponse = new SystemResponse(true,"Fetching all the products are successful.");
        clr.setSystemResponse(systemResponse);

        return clr;
    }

}
