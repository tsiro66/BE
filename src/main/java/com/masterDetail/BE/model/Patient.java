package com.masterDetail.BE.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "patient")
public class Patient {

    @Id
    private String patientId;
    private String firstName;
    private String lastName;
    private LocalDate dob;
    private String gender;



    public Patient() {
    }

    public Patient(String patientId, String firstName, String lastName, LocalDate dob, String gender) {
        this.patientId = patientId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.gender = gender;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDob() { return dob; }

    public void setDob(LocalDate dob) { this.dob = dob; }

    public String getGender() { return gender; }

    public void setGender(String gender) { this.gender = gender; }

}
