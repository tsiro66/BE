package com.masterDetail.BE.service.impl;

import com.masterDetail.BE.model.Patient;
import com.masterDetail.BE.repository.PatientRepository;
import com.masterDetail.BE.service.PatientService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientServiceImpl implements PatientService {

    PatientRepository patientRepository;

    public PatientServiceImpl(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    @Override
    public String createPatient(Patient patient) {
        patientRepository.save(patient);
        return "Success";
    }

    @Override
    public String updatePatient(Patient patient) {
        patientRepository.save(patient);
        return "Success";
    }

    @Override
    public String deletePatient(String patientId) {
        patientRepository.deleteById(patientId);
        return "Success";
    }

    @Override
    public Patient getPatient(String patientId) {
        return patientRepository.findById(patientId).get();
    }

    @Override
    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }
}
