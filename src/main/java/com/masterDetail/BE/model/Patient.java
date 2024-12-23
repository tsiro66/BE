package com.masterDetail.BE.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "patient")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long patientId;
    private String firstName;
    private String lastName;
    private LocalDate dob;
    private String gender;
    @OneToMany(mappedBy = "patient", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference //Remove cyclic references in JSON responses
    private List<Appointment> appointments = new ArrayList<>();


    public Patient() {
    }

    public Patient(Long patientId, String firstName, String lastName, LocalDate dob, String gender, List<Appointment> appointments) {
        this.patientId = patientId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.gender = gender;
        this.appointments = appointments;
    }

    public Long getPatientId() {
        return patientId;
    }

    public void setPatientId(Long patientId) {
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

    public List<Appointment> getAppointments() {
        return appointments;
    }

    public void setAppointments(List<Appointment> appointments) {
        this.appointments = appointments;
    }
}
