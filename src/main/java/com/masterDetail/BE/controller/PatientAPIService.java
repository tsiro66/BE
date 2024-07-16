package com.masterDetail.BE.controller;

import com.masterDetail.BE.model.Patient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/patient")
public class PatientAPIService {
    @GetMapping("{patientId}")
    public Patient getPatientDetails(String patientId) {
        return new Patient("1","Test","test");
    }
}
