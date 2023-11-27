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
@Table(name = "boletodevuelo")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class BoletoDeVuelo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idboletodevuelo")
    private int idBoletoDeVuelo;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idVuelo")
    private Vuelo vuelo;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idClase")
    private Clase clase;

    @Column(name = "numeroasiento")
    private String numeroAsiento;
}
