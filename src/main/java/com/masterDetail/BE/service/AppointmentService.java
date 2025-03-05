package com.masterDetail.BE.service;

import com.masterDetail.BE.model.Appointment;
import org.springframework.data.domain.Page;

import java.util.List;

public interface AppointmentService {
    public String createAppointment(Appointment appointment);
    public String updateAppointment(Appointment appointment);
    public String deleteAppointment(Long appointmentId);
    public Appointment getAppointment(Long appointmentId);
    public Page<Appointment> getAllAppointments(int pageNo, int pageSize);
}
