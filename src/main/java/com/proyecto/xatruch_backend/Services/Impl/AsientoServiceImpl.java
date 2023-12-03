package com.proyecto.xatruch_backend.Services.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.xatruch_backend.Models.Asiento;
import com.proyecto.xatruch_backend.Repositories.AsientoRepository;
import com.proyecto.xatruch_backend.Services.AsientoService;

@Service
public class AsientoServiceImpl implements AsientoService {
    
    @Autowired
    private AsientoRepository asientoRepository;

    public List<Asiento> obtenerPorTipoDeAvion(int idVuelo){
        return this.asientoRepository.findByVueloIdVuelo(idVuelo);
    }
}
