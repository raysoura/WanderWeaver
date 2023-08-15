package com.org.WanderWeaver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cafe")
public class CafeController {

    @GetMapping("/")
    public String getCafes() {
        return "Service started";
    }
}
