package com.example.EmployeePayrollApplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EmployeePayrollApplication.dto.EmployeePayrollDto;
import com.example.EmployeePayrollApplication.model.EmployeePayrollData;
import com.example.EmployeePayrollApplication.repository.EmployeePayrollRepo;

@Service
public class EmployeePayrollService implements IEmployeePayrollService {

    @Autowired
    EmployeePayrollRepo employeePayrollRepo;

    @Override
    public EmployeePayrollData createDetails(EmployeePayrollDto employeePayrollDto) {
        EmployeePayrollData employeeData = new EmployeePayrollData(employeePayrollDto.getName(),
                employeePayrollDto.getSalary(), employeePayrollDto.getProfilePic(),
                employeePayrollDto.getGender(), employeePayrollDto.getNotes(),
                employeePayrollDto.getStartDate());
        System.out.println("testing employee data" + employeeData);
        return employeePayrollRepo.save(employeeData);
    }

    @Override
    public EmployeePayrollData getDetailsById(int id) {
        EmployeePayrollData employeeData = employeePayrollRepo.findById(id).get();
        return employeeData;
    }

    @Override
    public List<EmployeePayrollData> getAllDetails() {
        return employeePayrollRepo.findAll();
    }

    @Override
    public EmployeePayrollData updateDetails(int id, EmployeePayrollDto employeePayrollDto) {
        EmployeePayrollData eData = employeePayrollRepo.findById(id).get();
        eData.setName(employeePayrollDto.getName());
        eData.setSalary(employeePayrollDto.getSalary());
        eData.setProfilePic(employeePayrollDto.getProfilePic());
        eData.setGender(employeePayrollDto.getGender());
        eData.setNotes(employeePayrollDto.getNotes());
        eData.setStartDate(employeePayrollDto.getStartDate());
        return employeePayrollRepo.save(eData);
    }

    @Override
    public void deleteDetailsById(int id) {
        employeePayrollRepo.deleteById(id);

    }

}
