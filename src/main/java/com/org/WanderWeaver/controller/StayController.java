package com.org.WanderWeaver.controller;

import com.org.WanderWeaver.models.Cafe;
import com.org.WanderWeaver.models.Stay;
import com.org.WanderWeaver.service.StayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/stay")
public class StayController {
    @Autowired
    private StayService stayService;

    @GetMapping("/")
    public List<Stay> getStays() {
        return stayService.getAll();
    }

    @GetMapping("/createStay")
    public Stay createStay(Stay stay) {
        return stayService.save(stay);
    }
}
