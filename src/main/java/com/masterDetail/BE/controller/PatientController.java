package com.masterDetail.BE.controller;

import com.masterDetail.BE.model.Patient;
import com.masterDetail.BE.service.PatientService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
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

    @PutMapping("/{patientId}")
    public String updatePatientDetails(@PathVariable("patientId") String patientId, @RequestBody Patient patient) {
        patient.setPatientId(patientId);
        patientService.updatePatient(patient);
        return "Patient Updated Successfully!";
    }

    @DeleteMapping("/{patientId}")
    public ResponseEntity<Void> deletePatientDetails(@PathVariable("patientId") String patientId) {
        patientService.deletePatient(patientId);
        return ResponseEntity.noContent().build();
    }
}
