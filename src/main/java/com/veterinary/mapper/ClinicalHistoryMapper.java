package com.veterinary.mapper;

import com.veterinary.dto.ClinicalHistoryDto;
import com.veterinary.models.ClinicalHistory;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface ClinicalHistoryMapper {
	
	ClinicalHistory toEntity(ClinicalHistoryDto clinicalHistoryDto);

	ClinicalHistoryDto toDto(ClinicalHistory clinicalHistory);

	List<ClinicalHistoryDto> toListDto(List<ClinicalHistory> clinicalHistories);
}
