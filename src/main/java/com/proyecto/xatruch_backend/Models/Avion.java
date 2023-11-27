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
@Table(name = "avion")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Avion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idavion")
    private int idAvion;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idtipoavion")
    private TipoAvion tipoAvion;
}
