package com.org.WanderWeaver.repository;

import com.org.WanderWeaver.models.Cafe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CafeRepository extends JpaRepository<Cafe, Integer> {

}
