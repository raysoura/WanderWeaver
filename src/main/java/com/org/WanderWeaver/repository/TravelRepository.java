package com.org.WanderWeaver.repository;

import com.org.WanderWeaver.models.Travel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TravelRepository extends JpaRepository<Travel, Integer> {
}
