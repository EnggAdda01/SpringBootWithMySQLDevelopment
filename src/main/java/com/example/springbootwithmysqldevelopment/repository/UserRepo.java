package com.example.springbootwithmysqldevelopment.repository;

import com.example.springbootwithmysqldevelopment.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {
}
