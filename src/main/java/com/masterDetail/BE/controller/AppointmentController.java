package com.masterDetail.BE.controller;

import com.masterDetail.BE.model.Appointment;
import com.masterDetail.BE.model.Patient;
import com.masterDetail.BE.service.AppointmentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/appointment")
public class AppointmentController {

    AppointmentService appointmentService;

    public AppointmentController(AppointmentService appointmentService) {
        this.appointmentService = appointmentService;
    }

    @GetMapping("{appointmentId}")
    public Appointment getAppointmentDetails(@PathVariable("appointmentId") String appointmentId) {
        return appointmentService.getAppointment(appointmentId);
    }

    @GetMapping()
    public List<Appointment> getAllAppointmentDetails() {
        return appointmentService.getAllAppointments();
    }

    @PostMapping
    public String createAppointmentDetails(@RequestBody Appointment appointment) {
        appointmentService.createAppointment(appointment);
        return "Appointment Created Successfully!";
    }

    @PutMapping
    public String updateAppointmentDetails(@RequestBody Appointment appointment) {
        appointmentService.updateAppointment(appointment);
        return "Appointment Updated Successfully!";
    }

    @DeleteMapping("{appointmentId}")
    public String deleteAppointmentDetails(@PathVariable("appointmentId") String appointmentId) {
        appointmentService.deleteAppointment(appointmentId);
        return "Appointment Deleted Successfully!";
    }
}
