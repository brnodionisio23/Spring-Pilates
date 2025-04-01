package com.brenodev.Pilates.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "Professor")
public class Teacher extends Person  {

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String hashPass;
}
