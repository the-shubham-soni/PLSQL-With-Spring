package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Developer;

public interface DeveloperRepository extends JpaRepository<Developer, Integer> {}