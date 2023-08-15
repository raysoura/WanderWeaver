package com.org.WanderWeaver.service;

import com.org.WanderWeaver.models.Travel;
import com.org.WanderWeaver.repository.TravelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TravelService {

    @Autowired
    private TravelRepository travelRepository;

    public List<Travel> getAll() {
        return travelRepository.findAll();
    }
}
