package com.uvm.control_escolar.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "estudiantes")
@AllArgsConstructor @NoArgsConstructor
public class Student {

    // Identification
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_estudiante")
    private Long id;

    @Column(name = "matricula")
    private String enrollmentNumber;

    @Column(name = "nombre")
    private String name;

    @Column(name = "apellidos")
    private String lastName;

    @Column(name = "CURP")
    private String CURP;

    // Personal Information
    @Column(name = "Fecha_de_nacimiento")
    private LocalDate dateOfBirth;

    @Column(name = "genero")
    private String gender;

    @Column(name = "direccion")
    private String address;

    @Column(name = "telefono")
    private String phone;

    @Column(name = "correo_institucional")
    private String email;

    @Column(name = "tipo_de_sangre")
    private String bloodType;

    @Column(name = "tutor")
    private String guardian;

    // Academic Information
    @Column(name = "nivel_educativo")
    private String educationLevel;

    @Column(name = "grado")
    private int grade;

    @Column(name = "grupo")
    private String group;

}
