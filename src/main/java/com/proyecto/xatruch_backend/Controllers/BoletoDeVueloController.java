package com.proyecto.xatruch_backend.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.xatruch_backend.Models.BoletoDeVuelo;
import com.proyecto.xatruch_backend.Services.Impl.BoletoDeVueloServiceImpl;

@RestController
@RequestMapping("/boletos/vuelo")
public class BoletoDeVueloController {
    
    @Autowired
    public BoletoDeVueloServiceImpl boletoDeVueloServiceImpl;

    @PostMapping("/crear")
    public BoletoDeVuelo crear(@RequestParam(name = "idUsuario")int idUsuario,
                               @RequestParam(name = "idAsiento")int idAsiento){
        return this.boletoDeVueloServiceImpl.crear(idUsuario, idAsiento);
    }

    @PostMapping("/obtener/todos/usuario")
    public List<BoletoDeVuelo> obtenerPorTodosUsuario(@RequestParam(name="idUsuario")int usuario){
        return this.boletoDeVueloServiceImpl.obtenerTodosPorIdUsuario(usuario);
    }

    @GetMapping("/obtener/todos")
    public List<BoletoDeVuelo> obtenerTodos(){
        return this.boletoDeVueloServiceImpl.obtenerTodos();
    }

    @DeleteMapping("/eliminar/{idBoletoDeVuelo}")
    public String eliminarBoleto(@RequestParam(name="idBoleto")int idBoletoDeVuelo){
        return this.boletoDeVueloServiceImpl.eliminarBoletoDeVuelo(idBoletoDeVuelo);
    }
}
