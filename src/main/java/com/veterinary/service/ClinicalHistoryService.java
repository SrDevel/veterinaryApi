package com.veterinary.service;

import com.veterinary.dto.ClinicalHistoryDto;

import java.util.List;

import org.springframework.stereotype.Service;

public interface ClinicalHistoryService {
    ClinicalHistoryDto createClinicalHistory(ClinicalHistoryDto clinicalHistoryDto);
    ClinicalHistoryDto updateClinicalHistory(ClinicalHistoryDto clinicalHistoryDto);
    void deleteClinicalHistory(Long id);
    ClinicalHistoryDto getClinicalHistory(Long id);
    List<ClinicalHistoryDto> getAllClinicalHistories();
}
