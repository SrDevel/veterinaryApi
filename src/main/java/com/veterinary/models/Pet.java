package com.veterinary.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "mascotas")
public class Pet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "nombre", length = 50)
    private String name;
    @Column(name = "duenio_id", length = 50)
    private long ownerId;
    @Column(name = "edad", length = 50)
    private int age;
    @Column(name = "especie", length = 50)
    private String breed;
    @Column(name = "raza", length = 50)
    private String race;
    @Column(name = "peso", length = 50)
    private float weight;
    @Column(name = "caracteristicas", length = 100)
    private String petCharacteristics;
}
