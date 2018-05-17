package com.example.myFirstSpring.service;

import com.example.myFirstSpring.entity.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by jiptc22 on 5/16/2018.
 */

@Service
@Transactional
public class UserServiceImpl implements UserService{
    @Override
    public void saveUser(User user) {

    }

    @Override
    public List<User> getUser() {
        return null;
    }
}
