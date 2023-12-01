package com.proyecto.xatruch_backend.Models;

import java.sql.Date;
import java.sql.Time;

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
@Table(name = "escala")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Escala {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idescala")
    private int idEscala;

    @Column(name = "fechasalida")
    private Date fechaSalida;

    @Column(name = "horasalida")
    private Time horaSalida;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idaeropuerto")
    private Aeropuerto aeropuerto;
}
