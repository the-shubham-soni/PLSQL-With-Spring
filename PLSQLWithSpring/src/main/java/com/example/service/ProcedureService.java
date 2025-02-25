package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import jakarta.persistence.EntityManager;
import jakarta.persistence.ParameterMode;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.StoredProcedureQuery;
import jakarta.transaction.Transactional;



@Service
public class ProcedureService {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Object[]> fetchDeveloperData() {
        Query query = entityManager.createNativeQuery("CALL FetchDeveloperData()");
        return query.getResultList();
    }
    
    public List<Object[]> fetchManagementData() {
        Query query = entityManager.createNativeQuery("CALL FetchManagementData()");
        return query.getResultList();
    }
    
    public List<Object[]> fetchWorkerData() {
        Query query = entityManager.createNativeQuery("CALL FetchWorkerData()");
        return query.getResultList();
    }
    

    public List<Object[]> fetchDeveloperByRole(String role) {
        Query query = entityManager.createNativeQuery("CALL FetchDeveloperByRole(:role)");
        query.setParameter("role", role);
        return query.getResultList();
    }

    public List<Object[]> processManagementShort() {
        Query query = entityManager.createNativeQuery("CALL ProcessManagementShort()");
        return query.getResultList();
    }
}
