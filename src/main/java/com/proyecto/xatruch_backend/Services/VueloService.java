package com.proyecto.xatruch_backend.Services;

import java.sql.Date;
import java.sql.Time;
import java.util.List;

import com.proyecto.xatruch_backend.Models.Vuelo;

public interface VueloService {
    
    public List<Vuelo> obtenerTodos();

    public Vuelo obtenerPorId(int idVuelo);

    public List<Vuelo> obtenerPorCiudades(String ciudadOrigen, String ciudadDestino);

    public List<Vuelo> obtenerVueloPorFechaSalida(Date fechaSalida);

    public List<Vuelo> obtenerVueloPorHoraSalida(Time fechaSalida);

}
