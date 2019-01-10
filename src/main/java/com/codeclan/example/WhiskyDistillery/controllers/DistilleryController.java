package com.codeclan.example.WhiskyDistillery.controllers;


import com.codeclan.example.WhiskyDistillery.distilleryRepositories.DistilleryRepository;
import com.codeclan.example.WhiskyDistillery.models.Distillery;
import com.codeclan.example.WhiskyDistillery.models.Whisky;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value="/distillery")
public class DistilleryController {

    @Autowired
    DistilleryRepository distilleryRepository;

    @GetMapping(value = "/whiskysForDistillery/{id}")
    public List<Whisky> getWhiskysForDistillery(@PathVariable Long id) {
        Optional<Distillery> foundDistillery = distilleryRepository.findById(id);
        Distillery distillery = foundDistillery.get();
        return distilleryRepository.findAllWhiskysByDistillery(distillery);
    }
}
