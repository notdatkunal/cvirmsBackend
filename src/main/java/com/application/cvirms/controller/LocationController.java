package com.application.cvirms.controller;

import com.application.cvirms.dto.geography.Location;
import com.application.cvirms.repo.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LocationController {

    @Autowired
    LocationRepository locationRepository;
    @GetMapping("/location")
    public List<Location> getLocations(){

        return locationRepository.findAll();
    }


}
