package com.org.WanderWeaver.repository;

import com.org.WanderWeaver.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
