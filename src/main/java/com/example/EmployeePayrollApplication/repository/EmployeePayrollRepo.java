package com.example.EmployeePayrollApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.EmployeePayrollApplication.model.EmployeePayrollData;

@Repository
public interface EmployeePayrollRepo extends JpaRepository<EmployeePayrollData, Integer> {
    
}
