package com.veterinary.models;

import jakarta.persistence.*;

@Entity
@Table(name = "alergia")
public class Allergy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
}
