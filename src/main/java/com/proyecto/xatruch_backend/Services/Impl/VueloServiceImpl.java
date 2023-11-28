package com.proyecto.xatruch_backend.Services.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.xatruch_backend.Models.Vuelo;
import com.proyecto.xatruch_backend.Repositories.VueloRepository;
import com.proyecto.xatruch_backend.Services.VueloService;

@Service
public class VueloServiceImpl implements VueloService{

    @Autowired
    private VueloRepository vueloRepository;

    @Override
    public List<Vuelo> obtenerTodos() {
        return this.vueloRepository.findAll(); 
    }

    // @Override
    // public List<Vuelo> obtenerPorFecha(LocalDateTime date) {
    //     return this.vueloRepository.obtenerPorFecha(date);
    // }
    
}
