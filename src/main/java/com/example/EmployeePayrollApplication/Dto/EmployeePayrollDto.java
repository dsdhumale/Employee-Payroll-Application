package com.example.EmployeePayrollApplication.dto;

import java.time.LocalDate;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeePayrollDto {
    private String name;
    private long salary;
    private String profilePic;
    private String gender;
    private String notes;
    private LocalDate startDate;
    
}
    
    
