package com.proyecto.xatruch_backend.Services.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.xatruch_backend.Models.BoletoDeVuelo;
import com.proyecto.xatruch_backend.Models.Usuario;
import com.proyecto.xatruch_backend.Repositories.BoletoDeVueloRepository;
import com.proyecto.xatruch_backend.Services.BoletoDeVueloService;

@Service
public class BoletoDeVueloServiceImpl implements BoletoDeVueloService{

    @Autowired
    public BoletoDeVueloRepository boletoDeVueloRepository;

    @Override
    public List<BoletoDeVuelo> obtenerTodosPorIdUsuario(Usuario usuario) {
        return this.boletoDeVueloRepository.findBoletoDeVueloByUsuario(usuario);
    }

    @Override
    public List<BoletoDeVuelo> obtenerTodos() {
        return this.boletoDeVueloRepository.findAll();
    }

    @Override
    public String eliminarBoletoDeVuelo(int idBoletoDeVuelo) {
        BoletoDeVuelo boleto = this.boletoDeVueloRepository.findById(idBoletoDeVuelo).get();
        if(boleto !=null){
            this.boletoDeVueloRepository.delete(boleto);
            return "Se elimino el boleto con Id: " + boleto.getIdBoletoDeVuelo();
        }
        return "No se encontro el boleto con Id: " + boleto.getIdBoletoDeVuelo();
    }

    @Override
    public BoletoDeVuelo crear(BoletoDeVuelo boleto) {
        return this.boletoDeVueloRepository.save(boleto);
    }
    
}
