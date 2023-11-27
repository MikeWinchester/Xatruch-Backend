package com.proyecto.xatruch_backend.Repositories;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.proyecto.xatruch_backend.Models.Vuelo;

public interface VueloRepository extends JpaRepository<Vuelo, Integer>{

    // @Query("SELECT * FROM Vuelo WHERE vuelo.fechaSalida = :fechaSalida")
    // public List<Vuelo> obtenerPorFecha(@Param("fechaSalida")LocalDateTime fechaSalida);

}
