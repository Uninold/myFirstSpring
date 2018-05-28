package com.example.myFirstSpring.dao;

import com.example.myFirstSpring.entity.User;

import java.util.List;

/**
 * Created by jiptc22 on 5/16/2018.
 */
public interface UserDAO {
    public void saveUser(User user);
    public List<User> getUser();
    public boolean loginCustomer(User user);

}
