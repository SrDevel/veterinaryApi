package com.veterinary.service;

import com.veterinary.dto.PetDto;
import com.veterinary.mapper.PetMapper;
import com.veterinary.models.Pet;
import com.veterinary.repository.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PetServiceImpl implements PetService {
    @Autowired
    private PetRepository petRepository;
    // Obtenemos em Mapper de PetMapper
    @Autowired
    private PetMapper petMapper;

    @Override
    public PetDto createPet(PetDto petDto) {
        //Toda validacion que no tome el jakarta
        var pet = petMapper.toEntity(petDto);
        pet = petRepository.save(pet);
        return petMapper.toDto(pet);
    }

    @Override
    public PetDto updatePet(PetDto petDto) {
        var pet = petMapper.toEntity(petDto);
        pet = petRepository.save(pet);
        return petMapper.toDto(pet);
    }

    @Override
    public void deletePet(Long id) {
        petRepository.deleteById(id);
    }

    @Override
    public PetDto getPet(Long id) {
        return petRepository.findById(id).map(petMapper::toDto).orElse(null);
    }

    @Override
    public List<PetDto> getAllPets() {
        return petMapper.toListDto(petRepository.findAll());
    }

    @Override
    public List<PetDto> getPetByOwner(Long ownerId) {
        return petMapper.toListDto(petRepository.findByOwnerId(ownerId));
    }

}
