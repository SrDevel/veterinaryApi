package com.veterinary.controller;


import com.veterinary.dto.ClinicalHistoryDto;
import com.veterinary.service.ClinicalHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "clinicalhistory")
public class ClinicalHistoryController {
    @Autowired
    private ClinicalHistoryService clinicalHistoryService;

    @PostMapping("/create")
    public ResponseEntity<ClinicalHistoryDto> createClinicalHistory(@RequestBody ClinicalHistoryDto clinicalHistoryDto){
        try {
            if (clinicalHistoryDto == null) {
                return ResponseEntity.ok().build();
            } else {
                return ResponseEntity.ok(clinicalHistoryService.createClinicalHistory(clinicalHistoryDto));
            }
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<ClinicalHistoryDto> getClinicalHistory(@RequestParam Long id){
        try {
            if (id == null) {
                return ResponseEntity.ok().build();
            } else {
                return ResponseEntity.ok(clinicalHistoryService.getClinicalHistory(id));
            }
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<ClinicalHistoryDto> updateClinicalHistory(@RequestParam Long id){
        try {
            if (id == null) {
                return ResponseEntity.ok().build();
            } else {
                return ResponseEntity.notFound().build();
            }
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<HttpStatus> deleteClinicalHistory(@RequestParam Long id){
        try {
            if (id == null) {
                return ResponseEntity.ok().build();
            } else {
                return ResponseEntity.notFound().build();
            }
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/getall")
    public List<ClinicalHistoryDto> getAllClinicalHistories(){
        try {
            if (clinicalHistoryService.getAllClinicalHistories().isEmpty()) {
                return null;
            } else {
                return clinicalHistoryService.getAllClinicalHistories();
            }
        } catch (Exception e) {
            System.err.println(e);
            return null;
        }
    }

}
