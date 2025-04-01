package com.brenodev.Pilates.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.io.Serializable;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
public abstract class Person implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NonNull
    @Column(name = "nome")
    private String name;

    @NonNull
    @Column(name = "Sobrenome")
    private String lastName;

    @NonNull
    @Column(name = "CPF")
    private String cpf;

    @NonNull
    @Column(name = "Telefone")
    private String phone;

    @NonNull
    @Column(name = "Email")
    private String mail;

    @NonNull
    @Column(name = "Nascimento")
    private LocalDate birth;

}
