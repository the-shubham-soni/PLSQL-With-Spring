package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.service.ManagementService;


@RestController
@RequestMapping("/api/management")
public class ManagementController {

    @Autowired
    private ManagementService managementService;

    @GetMapping("/processManagement")
    public ResponseEntity<String> processManagement(@RequestParam int empCode) {
        String result = managementService.processManagementShortWithParams(empCode);
        return ResponseEntity.ok("Result: " + result);
    }
}



