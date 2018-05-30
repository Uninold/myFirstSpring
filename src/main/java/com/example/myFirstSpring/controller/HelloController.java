package com.example.myFirstSpring.controller;

import com.example.myFirstSpring.entity.User;
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
public class HelloController {
    @Autowired
    private UserService userService;

//    @RequestMapping(value = "/sayhello")
//    public String sayHello(
//      @RequestParam(name = "firstname") String name
//    ){
//        return "HELLO "+name+"!!!!";
//    }
    @RequestMapping(value = "/hello",
            method = RequestMethod.POST,
    consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public SystemMessage register(
            @RequestBody User user
    ){
        userService.saveUser(user);
        return new SystemMessage(true,user.getFirstname()+" is added succesfully.");
    }
    @RequestMapping(value = "/login",
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public SystemResponse login(@RequestBody User user){
        SystemResponse systemResponse = new SystemResponse();
        systemResponse.setFlag(userService.login(user));
        if(systemResponse.isFlag()){
            systemResponse.setMessage(user.getUsername()+" is logged in successfully.");
        }else{
            systemResponse.setMessage("wrong username or password");
        }
        return systemResponse;
    }

}
