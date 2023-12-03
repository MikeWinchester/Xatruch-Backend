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

    public List<Asiento> obtenerPorVuelo(int idVuelo){
        return this.asientoRepository.findByVueloIdVuelo(idVuelo);
    }

    @Override
    public Asiento obtenerPorVueloYNumeroAsiento(int idVuelo, String numero){
        return this.asientoRepository.findByVueloIdVueloAndNumero(idVuelo, numero);
    }
}
