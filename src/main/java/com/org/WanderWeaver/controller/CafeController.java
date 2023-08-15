package com.org.WanderWeaver.controller;

import com.org.WanderWeaver.models.Cafe;
import com.org.WanderWeaver.service.CafeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cafe")
public class CafeController {
    private final CafeService cafeService;
    CafeController(CafeService cafeService) {
        this.cafeService = cafeService;
    }

    @GetMapping("/")
    public List<Cafe> getCafes() {
        return cafeService.getAll();
    }
}
