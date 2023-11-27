package com.proyecto.xatruch_backend.Services;

import java.util.List;

import com.proyecto.xatruch_backend.Models.Usuario;

public interface UsuarioService {

    public Usuario crearUsuario(Usuario nuevoUsuario);

    public Usuario obtenerUsuarioPorId(int idUsuario);

    public String eliminarUsuario(int idUsuario);

    public String actualizarUsuario(int idUsuario, Usuario infoUsuario);

    public List<Usuario> obtenerTodos();
    
}
