package com.proyecto.xatruch_backend.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyecto.xatruch_backend.Models.Asiento;

public interface AsientoRepository extends JpaRepository<Asiento, Integer>{
    
    public List<Asiento> findByVueloIdVuelo(int idTipoAvion);

}
