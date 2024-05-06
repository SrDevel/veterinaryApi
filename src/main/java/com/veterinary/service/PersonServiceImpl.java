package com.veterinary.service;

import com.veterinary.dto.PersonDto;
import com.veterinary.mapper.PersonMapper;
import com.veterinary.models.Person;
import com.veterinary.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements Personservice{
    
    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private PersonMapper personMapper;

    @Override
    public PersonDto createPerson(PersonDto personDto) {
        var person = personMapper.toEntity(personDto);
        person = personRepository.save(person);
        return personMapper.toDto(person);
    }

    @Override
    public PersonDto updatePerson(PersonDto personDto) {
        var person = personMapper.toEntity(personDto);
        person = personRepository.save(person);
        return personMapper.toDto(person);
    }

    @Override
    public void deletePerson(Long id) {
        personRepository.deleteById(id);
    }

    @Override
    public PersonDto getPerson(Long id) {
        return personRepository.findById(id).map(person -> personMapper.toDto(person)).orElse(null);
    }

    @Override
    public List<PersonDto> getAllPersons() {
        return personMapper.toListDto(personRepository.findAll());
    }

    @Override
    public PersonDto login(PersonDto personDto) {
        var person = personRepository.findByUsernameAndPassword(personDto.getUsername(), personDto.getPassword());
        person = personMapper.toEntity(personDto);
        return personMapper.toDto(person);
    }
}
