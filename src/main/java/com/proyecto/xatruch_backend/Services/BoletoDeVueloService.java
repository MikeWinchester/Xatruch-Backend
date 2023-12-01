package com.proyecto.xatruch_backend.Services;

import java.util.List;

import com.proyecto.xatruch_backend.Models.BoletoDeVuelo;

public interface BoletoDeVueloService {

    public BoletoDeVuelo crear(BoletoDeVuelo boleto);

    public List<BoletoDeVuelo> obtenerTodosPorIdUsuario(int usuario);

    public List<BoletoDeVuelo> obtenerTodos();

    public String eliminarBoletoDeVuelo(int idBoletoDeVuelo);
    
}
