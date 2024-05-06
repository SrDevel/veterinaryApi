package com.veterinary.service;

import com.veterinary.dto.PersonDto;

import java.util.List;

public interface Personservice {
    PersonDto createPerson(PersonDto personDto);
    PersonDto updatePerson(PersonDto personDto);
    void deletePerson(Long id);
    PersonDto getPerson(Long id);
    List<PersonDto> getAllPersons();
    PersonDto login(PersonDto personDto);
}
