package com.veterinary.mapper;

import com.veterinary.dto.PetDto;
import com.veterinary.models.Pet;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")

public interface PetMapper {
    Pet toEntity(PetDto petDto);
    PetDto toDto(Pet pet);
    List<PetDto> toListDto(List<Pet> pets);
}
