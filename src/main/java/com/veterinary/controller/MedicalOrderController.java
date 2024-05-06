package com.veterinary.controller;

import com.veterinary.dto.MedicalOrderDto;
import com.veterinary.service.MedicalOrderService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "medicalorder")
public class MedicalOrderController {
    @Autowired
    private MedicalOrderService medicalOrderService;

    @PostMapping("/create")
    public ResponseEntity<MedicalOrderDto> createMedicalOrder(@RequestBody @Valid MedicalOrderDto medicalOrderDto){
        System.out.println(medicalOrderDto);
        try {
            if (medicalOrderDto == null) {
                return ResponseEntity.badRequest().build();
            } else {
                return ResponseEntity.ok(medicalOrderService.createMedicalOrder(medicalOrderDto));
            }
        } catch (Exception e) {
            System.out.println(e);
            return ResponseEntity.badRequest().build();
        }
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<MedicalOrderDto> getMedicalOrder(@PathVariable Long id){
        try {
            if (id == null) {
                return ResponseEntity.badRequest().build();
            } else {
                return ResponseEntity.ok(medicalOrderService.getMedicalOrder(id));
            }
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/update")
    public ResponseEntity<MedicalOrderDto> updateMedicalOrder(@RequestBody @Valid MedicalOrderDto medicalOrderDto){
        try{
            if (medicalOrderDto == null) {
                return ResponseEntity.badRequest().build();
            } else {
                return ResponseEntity.ok(medicalOrderService.updateMedicalOrder(medicalOrderDto));
            }
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }

    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteMedicalOrder(@PathVariable Long id){
        try{
            if (id == null) {
                return ResponseEntity.badRequest().build();
            } else {
                medicalOrderService.deleteMedicalOrder(id);
                return ResponseEntity.ok().build();
            }
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/getall")
    public List<MedicalOrderDto> getAllMedicalOrders(){
        try {
            if (medicalOrderService.getAllMedicalOrders().isEmpty()) {
                return null;
            } else {
                return medicalOrderService.getAllMedicalOrders();
            }
        } catch (Exception e) {
            return null;
        }
    }

}
