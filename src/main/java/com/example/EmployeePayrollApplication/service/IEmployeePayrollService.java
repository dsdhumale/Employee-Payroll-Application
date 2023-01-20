package com.example.EmployeePayrollApplication.service;

import java.util.List;

import com.example.EmployeePayrollApplication.dto.EmployeePayrollDto;
import com.example.EmployeePayrollApplication.model.EmployeePayrollData;

public interface IEmployeePayrollService {
    
    public EmployeePayrollData createDetails(EmployeePayrollDto employeePayrollDto);

    public EmployeePayrollData getDetailsById(int id);

    public List<EmployeePayrollData> getAllDetails();

    public EmployeePayrollData updateDetails(int id,EmployeePayrollDto employeePayrollDto);

    public void deleteDetailsById(int id);
}
