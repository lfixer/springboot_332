package com.kata.spring.springboot_332.service;

import com.kata.spring.springboot_332.model.User;

import java.util.List;

public interface UserService {
    void add(User user);

    void deleteById(Long id);

    void update(User user);

    List<User> listUsers();

    User getUserById(Long id);
}
