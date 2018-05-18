package com.example.myFirstSpring.dao;

import com.example.myFirstSpring.entity.User;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by jiptc22 on 5/16/2018.
 */
@Repository
@Transactional
public class UserDAOImpl implements UserDAO {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void saveUser(User user) {
    Session currentSession = sessionFactory.getCurrentSession();
        currentSession.saveOrUpdate(user);
    }

    @Override
    public List<User> getUser() {
        Session currentSeassion = sessionFactory.getCurrentSession();
        String sql = "from User";
        Query query = currentSeassion.createQuery(sql);
        List<User> users = query.list();
        return users;
    }


}
