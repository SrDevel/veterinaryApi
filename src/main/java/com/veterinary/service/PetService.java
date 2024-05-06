package com.veterinary.service;

import com.veterinary.dto.PetDto;

import java.util.List;

public interface PetService {

    PetDto createPet(PetDto petDto);
    PetDto updatePet(PetDto petDto);
    void deletePet(Long id);
    PetDto getPet(Long id);
    List<PetDto> getAllPets();
    List<PetDto> getPetByOwner(Long ownerId);

}
