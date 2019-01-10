package com.codeclan.example.WhiskyDistillery.controllers;

import com.codeclan.example.WhiskyDistillery.models.Whisky;
import com.codeclan.example.WhiskyDistillery.whiskyRepositories.WhiskyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value="/whisky")
public class WhiskyController {

    @Autowired
    WhiskyRepository whiskyRepository;

    @GetMapping(value="/whiskysByYear/{year}")
    public List<Whisky> getWhiskysByYear(@PathVariable int year){
        return whiskyRepository.findAllWhiskysByYear(year);
    }

    @GetMapping(value="/whiskysByRegion/{region}")
    public List<Whisky> getAllWhiskysByRegion(@PathVariable String region){
        return whiskyRepository.getAllWhiskysByRegion(region);
    }

}




