package com.org.WanderWeaver.repository;

import com.org.WanderWeaver.models.Activity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActivityRepository extends JpaRepository<Activity, Integer> {
}
