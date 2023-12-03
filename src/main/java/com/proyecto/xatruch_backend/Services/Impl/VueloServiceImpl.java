package com.proyecto.xatruch_backend.Services.Impl;

import java.sql.Date;
import java.sql.Time;
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

    public List<Vuelo> obtenerPorCiudades(String ciudadOrigen, String ciudadDestino){
        return this.vueloRepository.findByRutaOrigenAeropuertoCiudadNombreAndRutaDestinoAeropuertoCiudadNombre(ciudadOrigen, ciudadDestino);
    }

    @Override
    public List<Vuelo> obtenerVueloPorFechaSalida(Date fechaSalida) {
        return this.vueloRepository.findVueloByFechaSalida(fechaSalida);
    }

    @Override
    public List<Vuelo> obtenerVueloPorHoraSalida(Time fechaSalida) {
        return this.vueloRepository.findVueloByHoraSalida(fechaSalida);
    }
    
    @Override
    public Vuelo obtenerPorId(int idVuelo){
        return this.vueloRepository.findById(idVuelo).get();
    }

    
}
