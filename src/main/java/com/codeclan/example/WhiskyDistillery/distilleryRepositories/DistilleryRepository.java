package com.codeclan.example.WhiskyDistillery.distilleryRepositories;

import com.codeclan.example.WhiskyDistillery.models.Distillery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


public interface DistilleryRepository extends JpaRepository<Distillery, Long>, DistilleryRepositoryCustom {
}
