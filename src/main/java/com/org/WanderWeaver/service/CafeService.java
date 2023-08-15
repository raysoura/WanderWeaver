package com.org.WanderWeaver.service;

import com.org.WanderWeaver.models.Cafe;
import com.org.WanderWeaver.repository.CafeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CafeService {
    @Autowired
    private CafeRepository cafeRepository;
    public List<Cafe> getAll() {
        return cafeRepository.findAll();
    }
}
