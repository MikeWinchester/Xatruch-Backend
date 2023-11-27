package com.proyecto.xatruch_backend.Models;

import java.time.LocalDateTime;

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
@Table(name = "vuelo")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Vuelo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idvuelo")
    private int idVuelo;

    @Column(name = "fechasalida")
    private LocalDateTime fechaSalida;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idruta")
    private Ruta ruta;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idavion")
    private Avion avion;

    @Column(name = "precioturista")
    private double precioTurista;
}
