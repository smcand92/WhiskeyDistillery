package com.codeclan.example.WhiskyDistillery.components;

import com.codeclan.example.WhiskyDistillery.distilleryRepositories.DistilleryRepository;
import com.codeclan.example.WhiskyDistillery.models.Distillery;
import com.codeclan.example.WhiskyDistillery.models.Whisky;
import com.codeclan.example.WhiskyDistillery.whiskyRepositories.WhiskyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;


@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    DistilleryRepository distilleryRepository;

    @Autowired
    WhiskyRepository whiskyRepository;


    public DataLoader(){

    }

    public void run(ApplicationArguments args){

        Distillery glendronach = new Distillery("Glendronach", "Islay");
        distilleryRepository.save(glendronach);

        Distillery macallan = new Distillery("The Macallan", "Lowlands");
        distilleryRepository.save(macallan);

        Whisky revival = new Whisky("The Glendronach - Revival", glendronach, 2002, 17);
        whiskyRepository.save(revival);

        Whisky jura = new Whisky("Jura", macallan, 1980, 39);
        whiskyRepository.save(jura);


    }
}

