package com.masterDetail.BE.service;

import com.masterDetail.BE.model.Appointment;

import java.util.List;

public interface AppointmentService {
    public String createAppointment(Appointment appointment);
    public String updateAppointment(Appointment appointment);
    public String deleteAppointment(String appointmentId);
    public Appointment getAppointment(String appointmentId);
    public List<Appointment> getAllAppointments();
}
