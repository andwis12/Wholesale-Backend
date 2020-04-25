package com.project.wholesale.dao;

import com.project.wholesale.entity.User;

import java.util.List;

public interface EmployeeDAO {
    List<User> get();

    User get(int id);

    void save(User user);

    void delete(int id);
}
