package com.masterDetail.BE.controller;

import com.masterDetail.BE.model.Patient;
import com.masterDetail.BE.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/patient")
public class PatientController {

    PatientService patientService;

    @Autowired
    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    @GetMapping("{patientId}")
    public Patient getPatientDetails(@PathVariable("patientId") Long patientId) {
        return patientService.getPatient(patientId);
    }

    @GetMapping()
    public Page<Patient> getAllPatientDetails(@RequestParam(value = "pageNo", defaultValue = "0", required = false) int pageNo,
                                              @RequestParam(value = "pageSize", defaultValue = "10", required = false) int pageSize) {
        return patientService.getAllPatients(pageNo, pageSize);
    }

    @PostMapping
    public String createPatientDetails(@RequestBody Patient patient) {
        patientService.createPatient(patient);
        return "Patient Created Successfully!";
    }

    @PutMapping("/{patientId}")
    @Transactional
    public String updatePatientDetails(@PathVariable("patientId") Long patientId, @RequestBody Patient patient) {
        patient.setPatientId(patientId);
        patientService.updatePatient(patient);
        return "Patient Updated Successfully!";
    }

    @DeleteMapping("/{patientId}")
    public ResponseEntity<Void> deletePatientDetails(@PathVariable("patientId") Long patientId) {
        patientService.deletePatient(patientId);
        return ResponseEntity.noContent().build();
    }
}
