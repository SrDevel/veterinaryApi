package com.veterinary.repository;

import com.veterinary.models.ClinicalHistory;
import org.springframework.data.jpa.repository.JpaRepository;
public interface ClinicalHistoryRepository extends JpaRepository<ClinicalHistory, Long> {
}
