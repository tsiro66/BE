package com.masterDetail.BE.model;

public class Patient {

    private String patientId;
    private String firstName;
    private String lastName;

    public Patient() {
    }

    public Patient(String patientId, String firstName, String lastName) {
        this.patientId = patientId;
        this.firstName = firstName;
        this.lastName = lastName;
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

}
