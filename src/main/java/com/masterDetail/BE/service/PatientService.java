package com.masterDetail.BE.service;

import com.masterDetail.BE.model.Patient;
import com.masterDetail.BE.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;

import java.util.List;

public interface PatientService {
    public String createPatient(Patient patient);
    public String updatePatient(Patient patient);
    public String deletePatient(Long patientId);
    public Patient getPatient(Long patientId);
    public Page<Patient> getAllPatients(int pageNo, int pageSize);

}
