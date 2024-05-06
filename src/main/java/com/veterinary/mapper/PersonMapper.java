package com.veterinary.mapper;

import com.veterinary.dto.PersonDto;
import com.veterinary.models.Person;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PersonMapper {
    Person toEntity(PersonDto personDto);
    PersonDto toDto(Person person);
    List<PersonDto> toListDto(List<Person> persons);
}
