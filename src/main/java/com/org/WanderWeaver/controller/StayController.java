package com.org.WanderWeaver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stay")
public class StayController {

    @GetMapping("/")
    public String getStays() {
        return "Service started";
    }
}
