package com.codeclan.example.WhiskyTracker.controllers;

import com.codeclan.example.WhiskyTracker.models.Distillery;
import com.codeclan.example.WhiskyTracker.models.Whisky;
import com.codeclan.example.WhiskyTracker.repositories.DistilleryRepository.DistilleryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/distilleries")
public class DistilleryController {

    @Autowired
    DistilleryRepository distilleryRepository;

    @GetMapping(value = "/search/findDistilleryByRegion")
    public List<Distillery> findDistilleryByRegion(@RequestParam String region){
        return distilleryRepository.findDistilleryByRegion(region);
    }

    @GetMapping(value = "/search/findByDistilleryAndAge")
    public List<Whisky> findByDistilleryAndAge(@RequestParam Long id, int age){
        return distilleryRepository.findByDistilleryAndAge(id, age);
    }



}
