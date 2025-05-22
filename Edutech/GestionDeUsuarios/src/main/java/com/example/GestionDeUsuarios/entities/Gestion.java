package com.example.GestionDeUsuarios.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Builder
@Table(name = "gestion")
@AllArgsConstructor
@NoArgsConstructor
public class Gestion {
    //atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private int edad;

    @Column(name = "apellido")
    private String apellido;
}


