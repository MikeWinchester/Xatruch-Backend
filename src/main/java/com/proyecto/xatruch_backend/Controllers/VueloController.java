package com.proyecto.xatruch_backend.Controllers;

import java.sql.Date;
import java.sql.Time;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.proyecto.xatruch_backend.Models.Vuelo;
import com.proyecto.xatruch_backend.Services.Impl.VueloServiceImpl;

@RestController
@RequestMapping("/vuelos")
public class VueloController {
    
    @Autowired
    private VueloServiceImpl vueloServiceImpl;

    @GetMapping("/obtener/todos")
    public List<Vuelo> obtenerVuelos(){
        return this.vueloServiceImpl.obtenerTodos();
    }

    @GetMapping("/obtener/ciudades")
    public List<Vuelo> obtenerPorRuta(@RequestParam(name ="origen") String origen,
                                      @RequestParam(name = "destino")String destino){
        return this.vueloServiceImpl.obtenerPorCiudades(origen, destino);
    }

    @PostMapping("/obtener/{fechaSalida}")
    public List<Vuelo> buscarVueloPorFechaSalida(@RequestParam(name="fechaSalida")Date fechaSalida){
        return this.vueloServiceImpl.obtenerVueloPorFechaSalida(fechaSalida);
    }

    @GetMapping("/obtener/horaSalida")
    public List<Vuelo> buscarVueloPorHoraSalida(@RequestParam(name="horaSalida")Time horaSalida){
        return this.vueloServiceImpl.obtenerVueloPorHoraSalida(horaSalida);
    }

}
