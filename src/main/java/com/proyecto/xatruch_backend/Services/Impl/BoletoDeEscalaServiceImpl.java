package com.proyecto.xatruch_backend.Services.Impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.xatruch_backend.Models.BoletoDeEscala;
import com.proyecto.xatruch_backend.Repositories.BoletoDeEscalaRepository;
import com.proyecto.xatruch_backend.Services.BoletoDeEscalaService;

@Service
public class BoletoDeEscalaServiceImpl implements BoletoDeEscalaService{

    @Autowired
    public BoletoDeEscalaRepository boletoDeEscalaRepository;

    @Override
    public BoletoDeEscala crear(BoletoDeEscala boletoDeEscala) {
        return this.boletoDeEscalaRepository.save(boletoDeEscala);
    }

}