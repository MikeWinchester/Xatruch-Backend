package com.proyecto.xatruch_backend.Models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "origen")
@Data
public class Origen {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idorigen")
    private int idOrigen;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idaeropuerto")
    private Aeropuerto aeropuerto;
}
