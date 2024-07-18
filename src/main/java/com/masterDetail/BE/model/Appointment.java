package com.masterDetail.BE.model;

import jakarta.persistence.*;
import org.w3c.dom.Text;

import java.time.LocalDateTime;

@Entity
@Table(name = "appointment")
public class Appointment {

    @Id
    private String appointmentId;
    @ManyToOne
    @JoinColumn(name = "patientId", nullable = false)
    private Patient patient;
    private LocalDateTime appointmentDateTime;
    private String description;

    public Appointment() {
    }

    public Appointment(String appointmentId, Patient patient, LocalDateTime appointmentDateTime, String description) {
        this.appointmentId = appointmentId;
        this.patient = patient;
        this.appointmentDateTime = appointmentDateTime;
        this.description = description;
    }

    public String getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(String appointmentId) {
        this.appointmentId = appointmentId;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public LocalDateTime getAppointmentDateTime() {
        return appointmentDateTime;
    }

    public void setAppointmentDateTime(LocalDateTime appointmentDateTime) {
        this.appointmentDateTime = appointmentDateTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
