package com.proyecto.xatruch_backend.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.xatruch_backend.Models.Asiento;
import com.proyecto.xatruch_backend.Services.Impl.AsientoServiceImpl;

@RestController
@RequestMapping("/asientos")
public class AsientoController {
    
    @Autowired
    private AsientoServiceImpl asientoServiceImpl;

    @GetMapping("/obtener/vuelo")
    public List<Asiento> obtenerPorTipoDeAvion(@RequestParam(name = "idVuelo")int idVuelo){
        return this.asientoServiceImpl.obtenerPorTipoDeAvion(idVuelo);
    }
}
