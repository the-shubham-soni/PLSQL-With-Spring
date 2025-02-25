package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Integer> {}