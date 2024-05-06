package com.veterinary.mapper;

import com.veterinary.dto.MedicalOrderDto;
import com.veterinary.models.MedicalOrder;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface MedicalOrderMapper {
    MedicalOrder toEntity(MedicalOrderDto medicalOrderDto);
    MedicalOrderDto toDto(MedicalOrder medicalOrder);

    List<MedicalOrderDto> toListDto(List<MedicalOrder> medicalOrders);

}
