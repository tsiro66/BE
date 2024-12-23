package com.masterDetail.BE.service.impl;

import com.masterDetail.BE.model.Appointment;
import com.masterDetail.BE.repository.AppointmentRepository;
import com.masterDetail.BE.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentServiceImpl implements AppointmentService {

    @Autowired
    AppointmentRepository appointmentRepository;
//
//    public AppointmentServiceImpl(AppointmentRepository appointmentRepository){
//        this.appointmentRepository = appointmentRepository;
//    }

    @Override
    public String createAppointment(Appointment appointment) {
        appointmentRepository.save(appointment);
        return "Success";
    }

    @Override
    public String updateAppointment(Appointment appointment) {
        appointmentRepository.save(appointment);
        return "Success";
    }

    @Override
    public String deleteAppointment(Long appointmentId) {
        appointmentRepository.deleteById(appointmentId);
        return "Success";
    }

    @Override
    public Appointment getAppointment(Long appointmentId) {
        return appointmentRepository.findById(appointmentId).get();
    }

    @Override
    public List<Appointment> getAllAppointments() {
        return appointmentRepository.findAll();
    }
}
