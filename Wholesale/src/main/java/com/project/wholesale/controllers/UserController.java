package com.project.wholesale.controllers;

import com.project.wholesale.entity.User;
import com.project.wholesale.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

        @Autowired
        EmployeeService employeeService;

        @GetMapping("/employee")
        public List<User> get(){
                return employeeService.get();
        }
        @PostMapping("/employee/add")
        public void add(@RequestBody User user){
                employeeService.save(user);
        }

}
