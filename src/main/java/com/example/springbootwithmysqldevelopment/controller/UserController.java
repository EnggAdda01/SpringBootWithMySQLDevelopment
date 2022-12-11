package com.example.springbootwithmysqldevelopment.controller;


import com.example.springbootwithmysqldevelopment.entity.User;
import com.example.springbootwithmysqldevelopment.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    private UserRepo userRepo;
    @PostMapping("/insert")
    public void insertUser(@RequestBody User user){
        userRepo.save(user);

    }

    @GetMapping("/get")
    public List<User> getUsers(){
      return userRepo.findAll();

    }
}
