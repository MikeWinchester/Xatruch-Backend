package com.proyecto.xatruch_backend.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyecto.xatruch_backend.Models.EscalaVuelo;

public interface EscalaVueloRepository extends JpaRepository<EscalaVuelo, Integer>{
    
    public List<EscalaVuelo> findEscalaVueloByVueloIdVuelo(int idVuelo);
}
