package com.org.WanderWeaver.service;

import com.org.WanderWeaver.models.Cafe;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CafeService {

    public List<Cafe> getAll() {
        return new ArrayList<>();
    }
}
