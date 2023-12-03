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
@Table(name = "asiento")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Asiento {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idasiento")
    private int idAsiento;

    @Column(name = "numero")
    private String numero;

    @Column(name = "disponible")
    private boolean disponible;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idvuelo")
    private Vuelo vuelo;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idclase")
    private Clase clase;

}
