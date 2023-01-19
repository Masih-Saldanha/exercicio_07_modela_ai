package com.modelaai.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.modelaai.api.model.Cars;

public interface CarsRepository extends JpaRepository<Cars, Long> {
    
}
