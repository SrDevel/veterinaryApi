package com.veterinary.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class PetDto {
    private long id;
    @NotNull(message = "El nombre no puede ser nulo.")
    @NotEmpty(message = "El nombre no puede ser vacio.")
    private String name;
    @NotNull(message = "El id del dueño no puede ser nulo.")
    @Positive(message = "El id del dueño debe ser un número positivo.")
    @NotEmpty(message = "El id del dueño no puede ser vacio.")
    private long ownerId;
    @NotNull(message = "La edad no puede ser nula.")
    @NotEmpty(message = "La edad no puede ser vacia.")
    private int age;
    @NotNull(message = "La especie no puede ser nula.")
    @NotEmpty(message = "La especie no puede ser vacia.")
    private String breed;
    @NotNull(message = "La raza no puede ser nula.")
    @NotEmpty(message = "La raza no puede ser vacia.")
    private String race;
    @NotNull(message = "El peso no puede ser nulo.")
    @NotEmpty(message = "El peso no puede ser vacio.")
    private float weight;
    @NotNull(message = "Las características de la mascota no pueden ser nulas.")
    @NotEmpty(message = "Las características de la mascota no pueden ser vacías.")
    private String petCharacteristics;
}
