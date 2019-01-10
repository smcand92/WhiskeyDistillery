package com.codeclan.example.WhiskyDistillery.whiskyRepositories;

import com.codeclan.example.WhiskyDistillery.models.Whisky;

import java.util.List;

public interface WhiskyRepositoryCustom {

    List<Whisky> findAllWhiskysByYear(int year);
    List<Whisky> getAllWhiskysByRegion(String region);
}
