package com.masterDetail.BE.service;

import com.masterDetail.BE.model.Patient;

import java.util.List;

public interface PatientService {
    public String createPatient(Patient patient);
    public String updatePatient(Patient patient);
    public String deletePatient(String patientId);
    public Patient getPatient(String patientId);
    public List<Patient> getAllPatients();

}
