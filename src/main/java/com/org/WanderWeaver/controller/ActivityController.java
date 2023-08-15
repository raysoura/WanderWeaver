package com.org.WanderWeaver.controller;

import com.org.WanderWeaver.models.Activity;
import com.org.WanderWeaver.models.Cafe;
import com.org.WanderWeaver.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/activity")
public class ActivityController {
    @Autowired
    private ActivityService activityService;
    @GetMapping("/")
    public List<Activity> getActivities() {
        return activityService.getAll();
    }

    @GetMapping("/createActivity")
    public Activity createActivity(Activity activity) {
        return activityService.save(activity);
    }
}
