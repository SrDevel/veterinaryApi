package com.veterinary.controller;


import com.veterinary.dto.PetDto;
import com.veterinary.service.PetService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "pet")
public class PetController {

    @Autowired
    private PetService petService;

    @PostMapping("/create")
    public ResponseEntity<PetDto> createPet(@RequestBody @Valid PetDto petDto){
        try{
            if (petDto == null) {
                return ResponseEntity.badRequest().build();
            } else {
                return ResponseEntity.ok(petService.createPet(petDto));
            }
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<PetDto> getPet(@PathVariable Long id){
        try{
            if (id == null) {
                return ResponseEntity.badRequest().build();
            } else {
                return ResponseEntity.ok(petService.getPet(id));
            }
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/update")
    public ResponseEntity<PetDto> updatePet(@RequestBody @Valid PetDto petDto){
        try{
            return ResponseEntity.ok(petService.updatePet(petDto));
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deletePet(@PathVariable Long id){
        try {
            if (id == null) {
                return ResponseEntity.badRequest().build();
            } else {
                petService.deletePet(id);
                return ResponseEntity.ok().build();
            }
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/getall")
    public ResponseEntity<Iterable<PetDto>> getAllPets(){
        try{
            return ResponseEntity.ok(petService.getAllPets());
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }
}
