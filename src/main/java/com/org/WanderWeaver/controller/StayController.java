package com.org.WanderWeaver.controller;

import com.org.WanderWeaver.models.Stay;
import com.org.WanderWeaver.service.StayService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/stay")
public class StayController {
    private final StayService stayService;
    StayController(StayService stayService) {
        this.stayService = stayService;
    }
    @GetMapping("/")
    public List<Stay> getStays() {
        return stayService.getAll();
    }
}
