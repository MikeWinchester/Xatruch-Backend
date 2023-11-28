package com.proyecto.xatruch_backend.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.xatruch_backend.Models.Usuario;
import com.proyecto.xatruch_backend.Services.Impl.UsuarioServiceImpl;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    
    @Autowired
    private UsuarioServiceImpl usuarioServiceImpl;

    @PostMapping("/crear")
    public Usuario crearUsuario(@RequestBody Usuario nuevoUsuario){
        return this.usuarioServiceImpl.crearUsuario(nuevoUsuario);
    }

    @GetMapping("/obtener/todos")
    public List<Usuario> obtenerTodos(){
        return this.usuarioServiceImpl.obtenerTodos();
    }
    
    @GetMapping("/obtener")
    public Usuario obtenerPorId(@RequestParam(name="idUsuario")int idUsuario){
        return this.usuarioServiceImpl.obtenerUsuarioPorId(idUsuario);
    }

    @DeleteMapping("/eliminar")
    public String eliminarPorId(@RequestParam(name="idUsuario")int idUsuario){
        return this.usuarioServiceImpl.eliminarUsuario(idUsuario);
    }

    @PutMapping("/actualizar")
    public String actualizarUsuario(@RequestParam(name="idUsuario")int idUsuario, @RequestBody Usuario usuario){
        return this.usuarioServiceImpl.actualizarUsuario(idUsuario, usuario);
    }

    @PostMapping("/login")
    public Usuario login(@RequestBody Usuario usuario){
        return this.usuarioServiceImpl.login(usuario);
    }
}
