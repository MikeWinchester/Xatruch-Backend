package com.proyecto.xatruch_backend.Controllers;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.proyecto.xatruch_backend.Models.BoletoDeEscala;
import com.proyecto.xatruch_backend.Services.Impl.BoletoDeEscalaServiceImpl;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/boletos/escala")
public class BoletoDeEscalaController {
    
    @Autowired
    public BoletoDeEscalaServiceImpl boletoDeEscalaServiceImpl;

    @PostMapping("/crear")
    public BoletoDeEscala crear(@RequestBody BoletoDeEscala boletoDeEscala){
        return this.boletoDeEscalaServiceImpl.crear(boletoDeEscala);
    }

}
