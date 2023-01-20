package com.example.EmployeePayrollApplication.model;

import java.time.LocalDate;

import jakarta.persistence.*;

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

    public EmployeePayrollData(int id, String name, long salary, String profilePic, String gender, String notes,
            LocalDate startDate) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.profilePic = profilePic;
        this.gender = gender;
        this.notes = notes;
        this.startDate = startDate;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public long getSalary() {
        return salary;
    }

    public String getProfilePic() {
        return profilePic;
    }

    public String getGender() {
        return gender;
    }

    public String getNotes() {
        return notes;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public void setProfilePic(String profilePic) {
        this.profilePic = profilePic;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    

    
}

