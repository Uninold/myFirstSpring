package com.example.myFirstSpring.dao;

import com.example.myFirstSpring.entity.Cart;
import com.example.myFirstSpring.entity.Products;
import com.example.myFirstSpring.entity.User;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Arnold on 28 May 2018.
 */
@Repository
@Transactional
public class ProductDAOImpl implements ProductDAO {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void saveCart(Cart cart) {
        Session currentSession = sessionFactory.getCurrentSession();
        currentSession.saveOrUpdate(cart);
    }

    @Override
    public List<Cart> getUser() {
        Session currentSeassion = sessionFactory.getCurrentSession();
        String sql = "from Cart";
        Query query = currentSeassion.createQuery(sql);
        List<Cart> cart = query.list();
        return cart;
    }

    @Override
    public List<Products> getProducts() {
        Session session = sessionFactory.getCurrentSession();
        Query theQuery = session.createQuery("from Products");
        List<Products> products= theQuery.list();
        return products;
    }

    @Override
    public String getRecommendation(String product_name) {
        Session session = sessionFactory.getCurrentSession();
        Query product = session.createQuery("from Products products where products.product_name = :product_name");
        product.setString("product_name", product_name);
//        Query theQuery = session.createQuery("from recommendation where id =:id");
//        theQuery.setString(product., "id");
        String recommendation = "";
        if(product_name.equalsIgnoreCase("Sangot"))
        {
            recommendation = "Pahait Service";
        }
        else if(product_name.equalsIgnoreCase("Luthang"))
        {
            recommendation = "Reload Holy Bullets Service";
        }
        else if(product_name.equalsIgnoreCase("Hanger ni Mama"))
        {
            recommendation = "Armament Haki Hanger Service";
        }
        return recommendation;
    }

}
