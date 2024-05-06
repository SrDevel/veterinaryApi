package com.veterinary.service;

import com.veterinary.dto.MedicalOrderDto;

import java.util.List;

public interface MedicalOrderService {
    MedicalOrderDto createMedicalOrder(MedicalOrderDto medicalOrderDto);
    MedicalOrderDto updateMedicalOrder(MedicalOrderDto medicalOrderDto);
    void deleteMedicalOrder(Long id);
    MedicalOrderDto getMedicalOrder(Long id);
    List<MedicalOrderDto> getAllMedicalOrders();
}
