package com.example.lab5_julio_aliaga.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="technician")
public class Medicamentos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="TechnicianID")
    private int id;
    @Column(nullable = false)
    private String FirstName;
    private String LastName;
    private String Dni;
    private String Phone;
    private int Age;
}