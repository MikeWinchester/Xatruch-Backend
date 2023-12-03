package com.proyecto.xatruch_backend.Services;

import java.util.List;

import com.proyecto.xatruch_backend.Models.Asiento;

public interface AsientoService {
    
    public List<Asiento> obtenerPorVuelo(int idVuelo);

    public Asiento obtenerPorVueloYNumeroAsiento(int idVuelo, String numero);
}
