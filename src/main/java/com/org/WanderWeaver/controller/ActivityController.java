package com.org.WanderWeaver.controller;

import com.org.WanderWeaver.models.Activity;
import com.org.WanderWeaver.service.ActivityService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/activity")
public class ActivityController {
    private final ActivityService activityService;
    ActivityController(ActivityService activityService) {
        this.activityService = activityService;
    }
    @GetMapping("/")
    public List<Activity> getActivities() {
        return activityService.getAll();
    }
}
