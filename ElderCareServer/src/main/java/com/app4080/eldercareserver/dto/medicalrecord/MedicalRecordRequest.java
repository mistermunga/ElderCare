package com.app4080.eldercareserver.dto.medicalrecord;

import java.time.LocalDateTime;

public class MedicalRecordRequest {

    private Long patientId;
    private Long doctorId;
    private LocalDateTime dateOfVisit;
    private String location;
    private String diagnosis;
    private String treatmentPlan;
    private String notes;

    // Getters and setters
    public Long getPatientId() {
        return patientId;
    }

    public void setPatientId(Long patientId) {
        this.patientId = patientId;
    }

    public Long getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Long doctorId) {
        this.doctorId = doctorId;
    }

    public LocalDateTime getDateOfVisit() {
        return dateOfVisit;
    }

    public void setDateOfVisit(LocalDateTime dateOfVisit) {
        this.dateOfVisit = dateOfVisit;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getTreatmentPlan() {
        return treatmentPlan;
    }

    public void setTreatmentPlan(String treatmentPlan) {
        this.treatmentPlan = treatmentPlan;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
