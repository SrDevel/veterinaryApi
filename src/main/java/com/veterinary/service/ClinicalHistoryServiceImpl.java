package com.veterinary.service;

import com.veterinary.dto.ClinicalHistoryDto;
import com.veterinary.mapper.ClinicalHistoryMapper;
import com.veterinary.repository.ClinicalHistoryRepository;

import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor (onConstructor = @__ (@Autowired))
public class ClinicalHistoryServiceImpl implements ClinicalHistoryService{

    private final ClinicalHistoryRepository clinicalHistoryRepository;

    private final ClinicalHistoryMapper clinicalHistoryMapper;
    
	@Override
    public ClinicalHistoryDto createClinicalHistory(ClinicalHistoryDto clinicalHistoryDto) {
        var clinicalHistory = clinicalHistoryMapper.toEntity(clinicalHistoryDto);
        clinicalHistory = clinicalHistoryRepository.save(clinicalHistory);
        return clinicalHistoryMapper.toDto(clinicalHistory);
    }

    @Override
    public ClinicalHistoryDto updateClinicalHistory(ClinicalHistoryDto clinicalHistoryDto) {
        var clinicalHistory = clinicalHistoryMapper.toEntity(clinicalHistoryDto);
        clinicalHistory = clinicalHistoryRepository.save(clinicalHistory);
        return clinicalHistoryMapper.toDto(clinicalHistory);
    }

    @Override
    public void deleteClinicalHistory(Long id) {
        clinicalHistoryRepository.deleteById(id);
    }

    @Override
    public ClinicalHistoryDto getClinicalHistory(Long id) {
        try {
            return clinicalHistoryRepository.findById(id).map(clinicalHistoryMapper::toDto).orElse(null);
        } catch (Exception e) {
            throw new RuntimeException("Clinical History not found");
        }
    }

    @Override
    public List<ClinicalHistoryDto> getAllClinicalHistories() {
        System.out.println(clinicalHistoryRepository.findAll());
        return clinicalHistoryMapper.toListDto(clinicalHistoryRepository.findAll());
    }
}
