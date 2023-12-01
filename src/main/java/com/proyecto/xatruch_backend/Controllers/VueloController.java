package com.proyecto.xatruch_backend.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    @PostMapping("/crear")
    public Vuelo crearVuelo(@RequestBody Vuelo vuelo){
        return this.vueloServiceImpl.crear(vuelo);
    }

    @GetMapping("/obtener/todos")
    public List<Vuelo> obtenerVuelos(){
        return this.vueloServiceImpl.obtener();
    }

    @GetMapping("/obtener/ciudades")
    public List<Vuelo> obtenerPorRuta(@RequestParam(name ="origen") String origen,
                                      @RequestParam(name = "destino")String destino){
        return this.vueloServiceImpl.obtenerPorCiudades(origen, destino);
    }

}
