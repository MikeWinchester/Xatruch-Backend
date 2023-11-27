package com.proyecto.xatruch_backend.Services.Impl;

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

}
