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
        
    public List<Vuelo> obtener() {
        return this.vueloRepository.findAll(); 
    }

    @Override
    public Vuelo crear(Vuelo nuevoVuelo) {
        return this.vueloRepository.save(nuevoVuelo);
    }
    public List<Vuelo> obtenerPorCiudades(String ciudadOrigen, String ciudadDestino){
        return this.vueloRepository.findByRutaOrigenAeropuertoCiudadNombreAndRutaDestinoAeropuertoCiudadNombre(ciudadOrigen, ciudadDestino);
    }
    

    
}
