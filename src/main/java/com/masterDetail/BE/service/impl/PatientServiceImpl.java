package com.masterDetail.BE.service.impl;

import com.masterDetail.BE.model.Patient;
import com.masterDetail.BE.repository.PatientRepository;
import com.masterDetail.BE.service.PatientService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PatientServiceImpl implements PatientService {

    @Autowired
    PatientRepository patientRepository;

    public PatientServiceImpl(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    @Override
    @Transactional
    public String createPatient(Patient patient) {
        patientRepository.save(patient);
        return "Success";
    }

    @Override
    @Transactional
    public String updatePatient(Patient patient) {
        if (!patientRepository.existsById(patient.getPatientId())) {
            throw new EntityNotFoundException("Patient not found with id: " + patient.getPatientId());
        }
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
