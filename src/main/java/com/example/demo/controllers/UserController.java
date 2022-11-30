package com.example.demo.controllers;

import com.example.demo.dao.UsersDao;
import com.example.demo.models.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
  private final UsersDao usersDao;

  public UserController(UsersDao usersDao) {
    this.usersDao = usersDao;
  }

  @RequestMapping(value = "/users", method = RequestMethod.GET)
    public List<User> getAllUsers() {
        return usersDao.getAllUsers();
    }
    @RequestMapping(value = "/users/{id}", method = RequestMethod.GET)
    public User getUserById(@PathVariable String id) {
        return usersDao.getUserById(id);
    }
    @PostMapping(value = "/users")
    public void addUser(@RequestBody User user) {
        usersDao.addUser(user);
    }

}
