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
@Table(name = "boletodeescala")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class BoletoDeEscala {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idboletodeescala")
    private int idBoletoDeEscala;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idescala")
    private Escala escala;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idboletodevuelo")
    private BoletoDeVuelo boletoDeVuelo;

}
