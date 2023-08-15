package com.org.WanderWeaver.service;

import com.org.WanderWeaver.models.Cafe;
import com.org.WanderWeaver.models.User;
import com.org.WanderWeaver.repository.CafeRepository;
import com.org.WanderWeaver.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> getAll() {
        return userRepository.findAll();
    }

    public User save(User user) {
        return userRepository.save(user);
    }
}
