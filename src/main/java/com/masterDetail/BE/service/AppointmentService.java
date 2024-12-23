package com.masterDetail.BE.service;

import com.masterDetail.BE.model.Appointment;

import java.util.List;

public interface AppointmentService {
    public String createAppointment(Appointment appointment);
    public String updateAppointment(Appointment appointment);
    public String deleteAppointment(Long appointmentId);
    public Appointment getAppointment(Long appointmentId);
    public List<Appointment> getAllAppointments();
}
