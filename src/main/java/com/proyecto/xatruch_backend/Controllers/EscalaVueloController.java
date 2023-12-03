package com.proyecto.xatruch_backend.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.xatruch_backend.Models.EscalaVuelo;
import com.proyecto.xatruch_backend.Services.Impl.EscalaVueloServiceImpl;

@RestController
@RequestMapping("/escala/vuelo")
public class EscalaVueloController {
    
    @Autowired
    public EscalaVueloServiceImpl escalaVueloServiceImpl;

    @GetMapping("/obtener")
    public List<EscalaVuelo> obtenerEscalasDeVuelo(@RequestParam(name="idVuelo")int idVuelo){
        return this.escalaVueloServiceImpl.obtenerEscalasDeVuelo(idVuelo);
    }

    @GetMapping("/obtener/todos")
    public List<EscalaVuelo> obtenerTodos(){
        return this.escalaVueloServiceImpl.obtenerTodos();
    }
}
