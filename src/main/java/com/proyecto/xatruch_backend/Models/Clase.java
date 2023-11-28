package com.proyecto.xatruch_backend.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "clase")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Clase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idclase")
    private int idClase;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "precioxkilometro")
    private double precioXKilometro;
}
