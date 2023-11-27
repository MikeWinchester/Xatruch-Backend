package com.proyecto.xatruch_backend.Services.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.xatruch_backend.Models.Usuario;
import com.proyecto.xatruch_backend.Repositories.UsuarioRepository;
import com.proyecto.xatruch_backend.Services.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService {
    
    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public Usuario crearUsuario(Usuario nuevoUsuario){
        return this.usuarioRepository.save(nuevoUsuario);
    }

    @Override
    public Usuario obtenerUsuarioPorId(int idUsuario) {
        return this.usuarioRepository.findById(idUsuario).get();
    }

    @Override
    public String eliminarUsuario(int idUsuario) {
        Usuario usuarioEliminar = this.usuarioRepository.findById(idUsuario).get();
        if(usuarioEliminar != null){
            this.usuarioRepository.delete(usuarioEliminar);
            return "Se ha eliminado al usuario con id: " + idUsuario;
        }
        return "No existe el usuario con id: " + idUsuario;
    }

    @Override
    public String actualizarUsuario(int idUsuario, Usuario infoUsuario) {
        Usuario usuarioActualizar = this.usuarioRepository.findById(idUsuario).get();
        if(usuarioActualizar != null){
            usuarioActualizar.setNombre(infoUsuario.getNombre());
            usuarioActualizar.setApellido(infoUsuario.getApellido());
            usuarioActualizar.setCorreo(infoUsuario.getCorreo());
            usuarioActualizar.setContrasenia(infoUsuario.getContrasenia());
            this.usuarioRepository.save(usuarioActualizar);
            return "Se ha actualizado el usuario: " + usuarioActualizar.getNombre();
        }
        return "No existe el usuario con id: " + idUsuario;
    }

    @Override
    public List<Usuario> obtenerTodos() {
        return this.usuarioRepository.findAll();
    }
}
