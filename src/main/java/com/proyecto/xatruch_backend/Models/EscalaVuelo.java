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
import lombok.Data;

@Entity
@Table(name = "escalavuelo")
@Data
public class EscalaVuelo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idescalavuelo")
    private int idEscalaVuelo;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idescala")
    private Escala escala;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idvuelo")
    private Vuelo vuelo;
}