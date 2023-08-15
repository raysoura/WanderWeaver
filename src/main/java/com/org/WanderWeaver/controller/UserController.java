package com.org.WanderWeaver.controller;

import com.org.WanderWeaver.models.User;
import com.org.WanderWeaver.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class UserController {

    private UserService userService;

    @GetMapping("/")
    public List<User> getAll() {
        return userService.getAll();
    }

    @GetMapping("/createUser")
    public User createUser(User user) {
        return userService.save(user);
    }
}
