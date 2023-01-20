package com.example.EmployeePayrollApplication.controller;

import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import com.example.EmployeePayrollApplication.Dto.EmployeePayrollDto;

@RestController
@RequestMapping("/employeepayrollservice")
public class EmployeePayrollController {


    // API for creating employee payroll data
    @PostMapping("/add")
    public ResponseEntity<String> create(@RequestBody EmployeePayrollDto employeePayrollDto) {
        return new ResponseEntity<>("Employee Payroll Data Created Successfully", HttpStatus.OK);
    }

    // API for fetching particular employee payroll data by id
    @GetMapping("/get/{id}")
    public ResponseEntity<String> getDetailById(@PathVariable int id) {
        return new ResponseEntity<>("Employee Payroll Data fetched Successfully " +id, HttpStatus.OK);
    }

    // API for fetching all employee payroll data
    @GetMapping("/getall")
    public ResponseEntity<String> getAllDetails() {
        return new ResponseEntity<>("All Employee Payroll Data fetched Successfully ", HttpStatus.OK);
    }

    // API for delete particular employee payroll data by id
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteDetailById(@PathVariable int id) {
        return new ResponseEntity<>("Employee Payroll Data deleted Successfully ", HttpStatus.OK);
    }

    // API for Update particular employee payroll data by id
    @PutMapping("/update/{id}")
    public ResponseEntity<String> create(@PathVariable int id,
            @RequestBody EmployeePayrollDto employeePayrollDto) {
        return new ResponseEntity<>("Employee Payroll Data Updated Successfully", HttpStatus.OK);
    }
}
