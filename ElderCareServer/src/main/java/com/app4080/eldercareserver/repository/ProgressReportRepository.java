package com.app4080.eldercareserver.repository;

import com.app4080.eldercareserver.entity.ProgressReport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDateTime;
import java.util.List;

public interface ProgressReportRepository extends JpaRepository<ProgressReport, Long> {
    List<ProgressReport> findByPatientId(Long patientId);
    List<ProgressReport> findByCaregiverId(Long caregiverId);

    // Find reports by date range
    List<ProgressReport> findByDateBetween(LocalDateTime startDate, LocalDateTime endDate);

//    // Find latest report for each patient
//    @Query("SELECT pr FROM ProgressReport pr WHERE pr.date = " +
//            "(SELECT MAX(pr2.date) FROM ProgressReport pr2 WHERE pr2.patientId = pr.patientId)")
//    List<ProgressReport> findLatestReportsForAllPatients();

    // Search reports by content
    @Query("SELECT pr FROM ProgressReport pr WHERE " +
            "LOWER(pr.summary) LIKE LOWER(CONCAT('%', :searchTerm, '%')) OR " +
            "LOWER(pr.recommendations) LIKE LOWER(CONCAT('%', :searchTerm, '%'))")
    List<ProgressReport> searchReports(@Param("searchTerm") String searchTerm);
}
