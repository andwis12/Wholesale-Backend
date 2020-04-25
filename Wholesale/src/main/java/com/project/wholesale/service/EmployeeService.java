package com.project.wholesale.service;

import com.project.wholesale.entity.User;

import java.util.List;

public interface EmployeeService {

    List<User> get();

    User get(int id);

    void save(User user);

    void delete(int id);
}
