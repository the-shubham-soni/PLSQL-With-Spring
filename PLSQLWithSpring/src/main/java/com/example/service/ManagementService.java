package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import jakarta.persistence.EntityManager;
import jakarta.persistence.ParameterMode;
import jakarta.persistence.StoredProcedureQuery;
import jakarta.transaction.Transactional;


@Service
public class ManagementService {

    @Autowired
    private EntityManager entityManager;

    @Transactional
    public String processManagementShortWithParams(int empCode) {
        // Create stored procedure query
        StoredProcedureQuery query = entityManager.createStoredProcedureQuery("ProcessManagementShortWithParams");

        // Register IN and OUT parameters
        query.registerStoredProcedureParameter("emp_code", Integer.class, ParameterMode.IN);
        query.registerStoredProcedureParameter("profile_status", String.class, ParameterMode.OUT);

        // Set the IN parameter
        query.setParameter("emp_code", empCode);

        // Execute the procedure
        query.execute();

        // Retrieve the OUT parameter value
        return (String) query.getOutputParameterValue("profile_status");
    }
    
}






