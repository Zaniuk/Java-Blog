package com.example.demo.dao;

import com.example.demo.models.User;

import java.util.List;

public interface UsersDao {
    List<User> getAllUsers();
    User getUserById(String id);
    void addUser(User user);
    void updateUser(User user);
    void deleteUser(String id);

}
