package com.proyecto.xatruch_backend.Services;

import java.util.List;

import com.proyecto.xatruch_backend.Models.EscalaVuelo;

public interface EscalaVueloService {
    
    public List<EscalaVuelo> obtenerEscalasDeVuelo(int idVuelo);

    public List<EscalaVuelo> obtenerTodos();
}
