package com.masterDetail.BE.controller;

import com.masterDetail.BE.model.Patient;
import com.masterDetail.BE.service.PatientService;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

@RestController
@RequestMapping("/patient")
public class PatientController {

    PatientService patientService;

    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    @GetMapping("{patientId}")
    public Patient getPatientDetails(@PathVariable("patientId") String patientId) {
        return patientService.getPatient(patientId);
    }

    @GetMapping()
    public List<Patient> getAllPatientDetails() {
        return patientService.getAllPatients();
    }

    @PostMapping
    public String createPatientDetails(@RequestBody Patient patient) {
        patientService.createPatient(patient);
        return "Patient Created Successfully!";
    }

    @PutMapping
    public String updatePatientDetails(@RequestBody Patient patient) {
        patientService.updatePatient(patient);
        return "Patient Updated Successfully!";
    }

    @DeleteMapping("{patientId}")
    public String deletePatientDetails(@PathVariable("patientId") String patientId) {
        patientService.deletePatient(patientId);
        return "Patient Deleted Successfully!";
    }
}
