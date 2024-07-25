package com.masterDetail.BE.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "appointment")
public class Appointment {

    @Id
    private String appointmentId;
    @ManyToOne
    @JoinColumn(name = "patientId", nullable = false)
    @JsonBackReference //Remove cyclic references in JSON responses
    private Patient patient;
    private LocalDate appointmentDate;
    private String description;

    public Appointment() {
    }

    public Appointment(String appointmentId, Patient patient, LocalDate appointmentDate, String description) {
        this.appointmentId = appointmentId;
        this.patient = patient;
        this.appointmentDate = appointmentDate;
        this.description = description;
    }

    public String getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(String appointmentId) {
        this.appointmentId = appointmentId;
    }

    @JsonIgnore
    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    @JsonProperty("patientId")
    public String patientId() {
        return patient !=null ? patient.getPatientId() : null;
    }

    public LocalDate getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(LocalDate appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
