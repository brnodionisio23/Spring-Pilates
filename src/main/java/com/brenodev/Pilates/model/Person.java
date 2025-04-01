package com.brenodev.Pilates.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class Person {
    private String name;
    private String lastName;
    private String cpf;
    private String phone;
    private String mail;
    private LocalDate birth;

}
