package com.masterDetail.BE.service.impl;

import com.masterDetail.BE.model.Appointment;
import com.masterDetail.BE.repository.AppointmentRepository;
import com.masterDetail.BE.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentServiceImpl implements AppointmentService {

    @Autowired
    AppointmentRepository appointmentRepository;

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
    public Page<Appointment> getAllAppointments(int pageNo, int pageSize) {
        Pageable pageable = PageRequest.of(pageNo, pageSize);
        Page<Appointment> appointments = appointmentRepository.findAll(pageable);
        return appointments;
    }
}
