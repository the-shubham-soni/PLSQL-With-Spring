package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Management;

public interface ManagementRepository extends JpaRepository<Management, Integer> {}