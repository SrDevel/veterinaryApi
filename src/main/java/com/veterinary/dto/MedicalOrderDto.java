package com.veterinary.dto;

import jakarta.validation.constraints.FutureOrPresent;
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

public class MedicalOrderDto {
    private long id;
    @NotNull(message = "El Id no puede ser nulo.")
    private long petId;
    @NotNull(message = "La medicación no puede ser nula.")
    private long ownerId;
    @NotNull(message = "La medicación no puede ser nula.")
    private long veterinarianId;
    @NotNull(message = "El nombre de la medicación no puede ser nulo.")
    @NotEmpty(message = "El nombre de la medicación no puede ser vacío.")
    private String medicationName;
    @NotNull(message = "La dosis no puede ser nula.")
    @NotEmpty(message = "La dosis no puede ser vacía.")
    @Positive(message = "La dosis debe ser un número positivo.")
    private String dose;
    @NotNull(message = "La fecha de generación no puede ser nula.")
    @NotEmpty(message = "La fecha de generación no puede ser vacía.")
    @FutureOrPresent(message = "La fecha de generación no puede ser pasada.")
    private String generationDate;
}
