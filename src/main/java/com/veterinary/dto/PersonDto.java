package com.veterinary.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PersonDto {
    private long id;
    @NotNull(message = "El nombre no puede ser nulo.")
    @NotEmpty(message = "El Nombre no puede estar vacio.")
    private String name;
    @NotNull(message = "La edad no puede ser nula.")
    @NotEmpty(message = "La edad no puede estar vacia.")
    @Positive(message = "La edad debe ser un número positivo.")
    @Length(min = 1, max = 3, message = "La edad debe tener entre 1 y 3 dígitos.")
    private int age;
    @NotNull(message = "El rol no puede ser nulo.")
    @NotEmpty(message = "El rol no puede estar vacio.")
    private String role;
    @NotNull(message = "El nombre de usuario no puede ser nulo.")
    @NotEmpty(message = "El nombre de usuario no puede estar vacio.")
    private String username;
    @NotNull(message = "La contraseña no puede ser nulo.")
    @NotEmpty(message = "La contraseña no puede estar vacia.")
    private String password;
}
