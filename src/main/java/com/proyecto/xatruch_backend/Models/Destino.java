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
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "destino")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Destino {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "iddestino")
    private int idDestino;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idaeropuerto")
    private Aeropuerto aeropuerto;
}