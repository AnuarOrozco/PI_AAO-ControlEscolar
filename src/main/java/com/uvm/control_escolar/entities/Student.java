package com.uvm.control_escolar.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "estudiantes")
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
    private String curp;

    // Personal Information
    @Column(name = "Fecha_de_nacimiento")
    private Date dateOfBirth;

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
