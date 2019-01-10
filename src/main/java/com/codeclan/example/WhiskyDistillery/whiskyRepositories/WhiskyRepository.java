package com.codeclan.example.WhiskyDistillery.whiskyRepositories;

import com.codeclan.example.WhiskyDistillery.models.Whisky;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WhiskyRepository extends JpaRepository<Whisky, Long>, WhiskyRepositoryCustom {
}
