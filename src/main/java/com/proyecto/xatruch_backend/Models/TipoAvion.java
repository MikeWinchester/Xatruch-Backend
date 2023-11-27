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
@Table(name = "tipoavion")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class TipoAvion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idtipoavion")
    private int idTipoAvion;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "capacidad")
    private int capacidad;
}

