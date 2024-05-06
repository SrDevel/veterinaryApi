package com.veterinary.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "orden_medica")
public class MedicalOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "id_mascota")
    private long petId;
    @Column(name = "id_duenio")
    private long ownerId;
    @Column(name = "id_veterinario")
    private long veterinarianId;
    @Column(name = "id_historia_clinica")
    private String medicationName;
    @Column(name = "dosis", length = 50)
    private String dose;
    @Column(name = "fecha_generacion", length = 50)
    private String generationDate;
}
