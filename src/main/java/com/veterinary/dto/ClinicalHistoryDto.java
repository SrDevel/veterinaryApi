package com.veterinary.dto;

import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ClinicalHistoryDto {
    private long id;
    @NotNull(message = "La fecha no puede ser nula.")
    @FutureOrPresent(message = "La fecha no puede ser pasada.")
    @NotEmpty(message = "La fecha no puede ser vacía.")
    private long date;
    @NotNull(message = "La identificación del veterinario no puede ser nula")
    @NotEmpty(message = "La identificación del veterinario no puede ser vacía.")
    private long veterinarian;
    @NotNull(message = "La identificación de la mascota no puede ser nula")
    @NotEmpty(message = "La identificación de la mascota no puede ser vacía.")
    private String reason;
    @NotNull(message = "Los síntomas no pueden ser nulos.")
    @NotEmpty(message = "Los síntomas no pueden ser vacíos.")
    private String symptoms;
    @NotNull(message = "El diagnóstico no puede ser nulo.")
    @NotEmpty(message = "El diagnóstico no puede ser vacío.")
    private String diagnosis;
    @NotNull(message = "El procedimiento no puede ser nulo.")
    @NotEmpty(message = "El procedimiento no puede ser vacío.")
    private String procedure;
    @NotNull(message = "La medicación no puede ser nula.")
    @NotEmpty(message = "La medicación no puede ser vacía.")
    private String medication;
    @NotNull(message = "La dosis no puede ser nula.")
    @NotEmpty(message = "La dosis no puede ser vacía.")
    private String dose;
    @NotNull(message = "La identificación de la orden no puede ser nula.")
    @NotEmpty(message = "La identificación de la orden no puede ser vacía.")
    private String idOrder;
    @NotNull(message = "La alergia no puede ser nula.")
    @NotEmpty(message = "La alergia no puede ser vacía.")
    private String allergy;
    @NotNull(message = "El detalle del procedimiento no puede ser nulo.")
    @NotEmpty(message = "El detalle del procedimiento no puede ser vacío.")
    private String procedureDetail;
    @NotNull(message = "La cancelación del pedido no puede ser nula")
    @NotEmpty(message = "La cancelación del pedido no puede ser vacía.")
    private boolean orderCancellation;
}
