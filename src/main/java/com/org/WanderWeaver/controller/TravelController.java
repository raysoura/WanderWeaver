package com.org.WanderWeaver.controller;

import com.org.WanderWeaver.models.Stay;
import com.org.WanderWeaver.models.Travel;
import com.org.WanderWeaver.service.TravelService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/travel")
public class TravelController {
    private final TravelService travelService;
    TravelController(TravelService travelService) {
        this.travelService = travelService;
    }
    @GetMapping("/")
    public List<Travel> getTravelDetails() {
        return travelService.getAll();
    }

    @GetMapping("/createTravel")
    public Travel createTravel(Travel travel) {
        return travelService.save(travel);
    }
}
