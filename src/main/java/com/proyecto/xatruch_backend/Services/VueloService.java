package com.proyecto.xatruch_backend.Services;

import java.util.List;

import com.proyecto.xatruch_backend.Models.Vuelo;

public interface VueloService {
    
    public List<Vuelo> obtener();

    public List<Vuelo> obtenerPorCiudades(String ciudadOrigen, String ciudadDestino);

}
