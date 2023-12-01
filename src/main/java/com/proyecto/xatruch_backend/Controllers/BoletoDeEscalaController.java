package com.proyecto.xatruch_backend.Controllers;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.proyecto.xatruch_backend.Services.Impl.BoletoDeEscalaServiceImpl;

@RestController
@RequestMapping("/boletos/escala")
public class BoletoDeEscalaController {
    
    @Autowired
    public BoletoDeEscalaServiceImpl boletoDeEscalaServiceImpl;

}
