package com.example.h2demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.h2demo.entity.FoodItem;

/**
 * Food repository interface to gain access to H2 database using JPA methods
 */
public interface FoodRepository extends JpaRepository<FoodItem, Long> {
    
}
