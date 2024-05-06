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
@Table(name = "persona")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "nombre", length = 50)
    private String name;
    @Column(name = "Edad", length = 20)
    private int age;
    @Column(name = "Rol", length = 30)
    private String role;
    @Column(name = "Nombre de Usuario", length = 30)
    private String username;
    @Column(name = "Contraseña", length = 30)
    private String password;
}
