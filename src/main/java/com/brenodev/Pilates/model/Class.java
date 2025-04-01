package com.brenodev.Pilates.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "Aula")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Class implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Data")
    private LocalDate date;

    @Column(name = "Hora")
    private LocalTime time;

    @Column(name = "Professor")
    private String teacher;

    @Column(name = "Aluno0")
    private String student0;

    @Column(name = "Aluno1")
    private String student1;

    @Column(name = "Aluno2")
    private String student2;

    @Column(name = "Aluno3")
    private String student3;
}
