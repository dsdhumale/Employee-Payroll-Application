package com.example.EmployeePayrollApplication.model;

import java.time.LocalDate;

import jakarta.persistence.*;
import lombok.*;

@Data
@Table(name="employee_payroll_data")
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class EmployeePayrollData {
    @Id
    private int id;
    private String name;
    private long salary;
    private String profilePic;
    private String gender;
    private String notes;
    private LocalDate startDate;

    public EmployeePayrollData( String name, long salary, String profilePic, String gender, String notes,
            LocalDate startDate) {
        this.name = name;
        this.salary = salary;
        this.profilePic = profilePic;
        this.gender = gender;
        this.notes = notes;
        this.startDate = startDate;
    }
    
}

