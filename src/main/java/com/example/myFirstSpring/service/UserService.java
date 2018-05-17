package com.example.myFirstSpring.service;

import com.example.myFirstSpring.entity.User;

import java.util.List;

/**
 * Created by jiptc22 on 5/16/2018.
 */
public interface UserService {
    public void saveUser(User user);
    public List<User> getUser();
}
