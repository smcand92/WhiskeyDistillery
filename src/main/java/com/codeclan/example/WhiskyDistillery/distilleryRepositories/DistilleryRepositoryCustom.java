package com.codeclan.example.WhiskyDistillery.distilleryRepositories;

import com.codeclan.example.WhiskyDistillery.models.Distillery;
import com.codeclan.example.WhiskyDistillery.models.Whisky;

import java.util.List;

public interface DistilleryRepositoryCustom {

    List<Whisky> findAllWhiskysByDistillery(Distillery distillery);
}
