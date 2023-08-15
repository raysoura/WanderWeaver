package com.org.WanderWeaver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/travel")
public class TravelController {

    @GetMapping("/")
    public String getTravelDetails() {
        return "Service started";
    }
}
