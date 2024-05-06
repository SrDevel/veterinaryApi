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
@Table(name = "historia_clinica")
public class ClinicalHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "fecha", length = 50)
    @Temporal(TemporalType.DATE)
    private long date;
    @Column(name = "id_mascota", length = 50)
    private long veterinarian;
    @Column(name = "motivo", length = 50)
    private String reason;
    @Column(name = "sintomas", length = 50)
    private String symptoms;
    @Column(name = "diagnostico", length = 50)
    private String diagnosis;
    @Column(name = "procedimiento", length = 50)
    private String procedure;
    @Column(name = "medicamento", length = 50)
    private String medication;
    @Column(name = "dosis", length = 50)
    private String dose;
    @Column(name = "id_orden", length = 50)
    private String idOrder;
    @Column(name = "alergia", length = 50)
    private String allergy;
    @Column(name = "detalle_procedimiento", length = 50)
    private String procedureDetail;
    @Column(name = "cancelacion_orden", length = 50)
    private boolean orderCancellation;
 }
