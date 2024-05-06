package com.veterinary.service;

import com.veterinary.dto.MedicalOrderDto;
import com.veterinary.mapper.MedicalOrderMapper;
import com.veterinary.models.MedicalOrder;
import com.veterinary.repository.MedicalOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MedicalOrderServiceImpl implements MedicalOrderService {

    @Autowired
    private MedicalOrderMapper medicalOrderMapper;
    @Autowired
    private MedicalOrderRepository medicalOrderRepository;
    @Override
    public MedicalOrderDto createMedicalOrder(MedicalOrderDto medicalOrderDto) {
        var medicalOrder = medicalOrderMapper.toEntity(medicalOrderDto);
        medicalOrder = medicalOrderRepository.save(medicalOrder);
        return medicalOrderMapper.toDto(medicalOrder);
    }

    @Override
    public MedicalOrderDto updateMedicalOrder(MedicalOrderDto medicalOrderDto) {
        var medicalOrder = medicalOrderMapper.toEntity(medicalOrderDto);
        medicalOrder = medicalOrderRepository.save(medicalOrder);
        return medicalOrderMapper.toDto(medicalOrder);
    }

    @Override
    public void deleteMedicalOrder(Long id) {
        medicalOrderRepository.deleteById(id);
    }

    @Override
    public MedicalOrderDto getMedicalOrder(Long id) {
        return medicalOrderRepository.findById(id).map(medicalOrder -> medicalOrderMapper.toDto(medicalOrder)).orElse(null);
    }

    @Override
    public List<MedicalOrderDto> getAllMedicalOrders() {
        return medicalOrderMapper.toListDto(medicalOrderRepository.findAll());
    }
}
