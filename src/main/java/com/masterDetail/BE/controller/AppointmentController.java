package com.masterDetail.BE.controller;

import com.masterDetail.BE.dto.AppointmentUpdateDTO;
import com.masterDetail.BE.model.Appointment;
import com.masterDetail.BE.model.Patient;
import com.masterDetail.BE.service.AppointmentService;
import com.masterDetail.BE.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/appointment")
public class AppointmentController {

    @Autowired
    AppointmentService appointmentService;

    @Autowired
    PatientService patientService;

    @Autowired
    public AppointmentController(AppointmentService appointmentService) {
        this.appointmentService = appointmentService;
    }

    @GetMapping("{appointmentId}")
    public Appointment getAppointmentDetails(@PathVariable("appointmentId") Long appointmentId) {
        return appointmentService.getAppointment(appointmentId);
    }

    @GetMapping()
    public Page<Appointment> getAllAppointmentDetails(@RequestParam(value = "pageNo", defaultValue = "0", required = false) int pageNo, @RequestParam(value = "pageSize", defaultValue = "10", required = false) int pageSize) {
        return appointmentService.getAllAppointments(pageNo, pageSize);
    }

    @PostMapping("/{patientId}")
    public String createAppointmentDetails(@PathVariable ("patientId")Long patientId,@RequestBody Appointment appointment) {
        Patient patient = patientService.getPatient(patientId);
        appointment.setPatient(patient);
        appointmentService.createAppointment(appointment);
        return "Appointment Created Successfully!";
    }

    @PutMapping("/{appointmentId}")
    public String updateAppointmentDetails(@PathVariable("appointmentId") Long appointmentId, @RequestBody AppointmentUpdateDTO appointmentUpdateDTO) {
        Appointment appointment = new Appointment();
        appointment.setAppointmentId(appointmentId);
        appointment.setAppointmentDate(appointmentUpdateDTO.getAppointmentDate());
        appointment.setDescription(appointmentUpdateDTO.getDescription());

        Patient patient = new Patient();
        patient.setPatientId(appointmentUpdateDTO.getPatientId());
        appointment.setPatient(patient);

        appointmentService.updateAppointment(appointment);
        return "Appointment Updated Successfully!";
    }

    @DeleteMapping("{appointmentId}")
    public String deleteAppointmentDetails(@PathVariable("appointmentId") Long appointmentId) {
        appointmentService.deleteAppointment(appointmentId);
        return "Appointment Deleted Successfully!";
    }
}
