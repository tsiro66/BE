package com.masterDetail.BE.repository;

import com.masterDetail.BE.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, String> {

}
