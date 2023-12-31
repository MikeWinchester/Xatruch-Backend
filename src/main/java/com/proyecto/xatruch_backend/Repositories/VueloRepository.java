package com.proyecto.xatruch_backend.Repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.proyecto.xatruch_backend.Models.Vuelo;

import java.sql.Date;
import java.sql.Time;
import java.util.List;


public interface VueloRepository extends JpaRepository<Vuelo, Integer>{

    List<Vuelo> findByRutaOrigenAeropuertoCiudadNombreAndRutaDestinoAeropuertoCiudadNombre(String ciudadOrigen, String ciudadDestino);

    List<Vuelo> findVueloByFechaSalida (Date fechaSalida);

    List<Vuelo> findVueloByHoraSalida (Time horaSalida);
}
