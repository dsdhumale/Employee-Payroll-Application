package com.example.EmployeePayrollApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeePayrollApplication {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Payroll Service Application");
		SpringApplication.run(EmployeePayrollApplication.class, args);
	}

}
