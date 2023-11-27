package com.proyecto.xatruch_backend.Models;

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
@Table(name = "ruta")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Ruta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idruta")
    private int idRuta;

    @ManyToOne
    @JoinColumn(name = "idorigen")
    private Origen origen;

    @ManyToOne
    @JoinColumn(name = "iddestino")
    private Destino destino;

    @Column(name = "kilometros")
    private double kilometros;
}
