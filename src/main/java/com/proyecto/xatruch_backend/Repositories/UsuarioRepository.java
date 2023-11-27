package com.proyecto.xatruch_backend.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyecto.xatruch_backend.Models.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{}

