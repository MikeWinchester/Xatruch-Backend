package com.proyecto.xatruch_backend.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyecto.xatruch_backend.Models.BoletoDeVuelo;

public interface BoletoDeVueloRepository extends JpaRepository<BoletoDeVuelo, Integer>{
    
    public List<BoletoDeVuelo> findBoletoDeVueloByUsuarioIdUsuario(int idUsuario);

}
