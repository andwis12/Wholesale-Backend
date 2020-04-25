package com.project.wholesale.service;

import com.project.wholesale.dao.EmployeeDAO;
import com.project.wholesale.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeServiceImplementation implements EmployeeService {
    @Autowired
    EmployeeDAO employeeDAO;


    @Transactional
    @Override
    public List<User> get() {
        return employeeDAO.get();
    }

    @Transactional
    @Override
    public User get(int id) {
        return null;
    }

    @Transactional
    @Override
    public void save(User user) {
        employeeDAO.save(user);
    }

    @Transactional
    @Override
    public void delete(int id) {

    }
}
