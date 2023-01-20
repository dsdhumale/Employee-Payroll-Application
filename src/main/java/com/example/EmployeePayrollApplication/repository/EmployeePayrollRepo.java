package com.example.EmployeePayrollApplication.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.EmployeePayrollApplication.model.EmployeePayrollData;

@Repository
public interface EmployeePayrollRepo extends JpaRepository<EmployeePayrollData, Integer> {
    @Query(value="select * from employee_payroll_data,payroll_department where employee_id=id and department=:department",nativeQuery=true)
    List<EmployeePayrollData> findEmployeePayrollByData(String department);
}
