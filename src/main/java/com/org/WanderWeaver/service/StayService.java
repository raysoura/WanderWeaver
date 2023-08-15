package com.org.WanderWeaver.service;

import com.org.WanderWeaver.models.Stay;
import com.org.WanderWeaver.repository.StayRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StayService {

    @Autowired
    private StayRepository stayRepository;

    public List<Stay> getAll() {
        return stayRepository.findAll();
    }
}
