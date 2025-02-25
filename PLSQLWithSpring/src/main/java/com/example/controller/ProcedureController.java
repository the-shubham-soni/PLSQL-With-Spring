package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.service.ProcedureService;

@RestController
@RequestMapping("/api")
public class ProcedureController {

    @Autowired
    private ProcedureService procedureService;

    @GetMapping("/fetchDeveloperData")
    public ResponseEntity<List<Object[]>> fetchDeveloperData() {
        List<Object[]> result = procedureService.fetchDeveloperData();
        return ResponseEntity.ok(result);
    }
    
    @GetMapping("/fetchManagementData")
    public ResponseEntity<List<Object[]>> fetchManagementData() {
        List<Object[]> result = procedureService.fetchManagementData();
        return ResponseEntity.ok(result);
    }
    
    @GetMapping("/fetchWorkerData")
    public ResponseEntity<List<Object[]>> fetchWorkerData() {
        List<Object[]> result = procedureService.fetchWorkerData();
        return ResponseEntity.ok(result);
    }

    @GetMapping("/fetchDeveloperByRole/{role}")
    public ResponseEntity<List<Object[]>> fetchDeveloperByRole(@PathVariable String role) {
        List<Object[]> result = procedureService.fetchDeveloperByRole(role);
        return ResponseEntity.ok(result);
    }

    @GetMapping("/processManagementShort")
    public ResponseEntity<List<Object[]>> processManagementShort() {
        List<Object[]> result = procedureService.processManagementShort();
        return ResponseEntity.ok(result);
    }
}
