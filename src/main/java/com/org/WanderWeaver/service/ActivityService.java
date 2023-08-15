package com.org.WanderWeaver.service;

import com.org.WanderWeaver.models.Activity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ActivityService {

    public List<Activity> getAll() {
        return new ArrayList<>();
    }
}
