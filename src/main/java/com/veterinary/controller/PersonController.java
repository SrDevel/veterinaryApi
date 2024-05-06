package com.veterinary.controller;


import com.veterinary.dto.PersonDto;
import com.veterinary.service.Personservice;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "person")
public class PersonController {
    @Autowired
    private Personservice personservice;

    @PostMapping("/create")
    public ResponseEntity<PersonDto> createPerson(@RequestBody @Valid PersonDto personDto){
        try{
            if (personDto == null) {
                return ResponseEntity.badRequest().build();
            } else {
                return ResponseEntity.ok(personservice.createPerson(personDto));
            }
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/login")
    public ResponseEntity<PersonDto> login(@RequestBody @Valid PersonDto personDto){
        try{
            if (personDto == null) {
                return ResponseEntity.badRequest().build();
            } else {
                return ResponseEntity.ok(personservice.login(personDto));
            }
        } catch (Exception e) {
           return  ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<PersonDto> getPerson(@PathVariable Long id){
        try{
            if (id == null) {
                return ResponseEntity.badRequest().build();
            } else {
                return ResponseEntity.ok(personservice.getPerson(id));
            }
        }catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/update")
    public ResponseEntity<PersonDto> updatePerson(@RequestBody @Valid PersonDto personDto){
        try{
            if (personDto == null) {
                return ResponseEntity.badRequest().build();
            } else {
                return ResponseEntity.ok(personservice.updatePerson(personDto));
            }
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<HttpStatus> deletePerson(@PathVariable Long id){
        try{
            if (id == null) {
                return ResponseEntity.badRequest().build();
            } else {
                personservice.deletePerson(id);
                return ResponseEntity.ok().build();
            }
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/getall")
    public ResponseEntity<Iterable<PersonDto>> getAllPersons() {
        try {
            return ResponseEntity.ok(personservice.getAllPersons());
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }
}
