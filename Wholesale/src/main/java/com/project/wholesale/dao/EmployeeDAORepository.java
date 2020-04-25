package com.project.wholesale.dao;

import com.project.wholesale.entity.User;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class EmployeeDAORepository implements EmployeeDAO{

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<User> get() {
        Session currentSession = entityManager.unwrap(Session.class);
        Query<User> query = currentSession.createQuery("from User",User.class);
        List<User> userList = query.getResultList();
        return userList;
    }

    @Override
    public User get(int id) {
        return null;
    }

    @Override
    public void save(User user) {
        Session currentSession = entityManager.unwrap(Session.class);
        currentSession.save(user);
    }

    @Override
    public void delete(int id) {

    }
}
