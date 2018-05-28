package com.example.myFirstSpring.service;

import com.example.myFirstSpring.dao.UserDAO;
import com.example.myFirstSpring.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by jiptc22 on 5/16/2018.
 */

@Service
@Transactional
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDAO userDAO;

    @Override
    public void saveUser(User user) {
        userDAO.saveUser(user);
    }

    @Override
    public boolean login(User user) {
        return userDAO.loginCustomer(user);
    }
    @Override
    public List<User> getUser() {

        return userDAO.getUser();
    }
}
