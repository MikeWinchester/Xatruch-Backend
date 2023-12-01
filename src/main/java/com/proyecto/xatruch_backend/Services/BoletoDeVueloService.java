package com.proyecto.xatruch_backend.Services;

import java.util.List;

import com.proyecto.xatruch_backend.Models.BoletoDeVuelo;
import com.proyecto.xatruch_backend.Models.Usuario;

public interface BoletoDeVueloService {

    public BoletoDeVuelo crear(BoletoDeVuelo boleto);

    public List<BoletoDeVuelo> obtenerTodosPorIdUsuario(Usuario usuario);

    public List<BoletoDeVuelo> obtenerTodos();

    public String eliminarBoletoDeVuelo(int idBoletoDeVuelo);
    
}
