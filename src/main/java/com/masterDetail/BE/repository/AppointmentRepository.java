package com.masterDetail.BE.repository;

import com.masterDetail.BE.model.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
}
