package com.proyecto.xatruch_backend.Repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.proyecto.xatruch_backend.Models.Vuelo;
import java.util.List;


public interface VueloRepository extends JpaRepository<Vuelo, Integer>{

    List<Vuelo> findByRutaOrigenAeropuertoCiudadNombreAndRutaDestinoAeropuertoCiudadNombre(String ciudadOrigen, String ciudadDestino);

}
