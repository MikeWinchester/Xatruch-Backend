package com.proyecto.xatruch_backend.Services.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.xatruch_backend.Models.EscalaVuelo;
import com.proyecto.xatruch_backend.Repositories.EscalaVueloRepository;
import com.proyecto.xatruch_backend.Services.EscalaVueloService;

@Service
public class EscalaVueloServiceImpl implements EscalaVueloService{

    @Autowired
    public EscalaVueloRepository escalaVueloRepository;

    @Override
    public List<EscalaVuelo> obtenerEscalasDeVuelo(int idVuelo) {
        return this.escalaVueloRepository.findEscalaVueloByVueloIdVuelo(idVuelo);
    }

    @Override
    public List<EscalaVuelo> obtenerTodos() {
        return this.escalaVueloRepository.findAll();
    }
    
}
