package com.proyecto.xatruch_backend.Services.Impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.xatruch_backend.Models.Asiento;
import com.proyecto.xatruch_backend.Models.BoletoDeEscala;
import com.proyecto.xatruch_backend.Models.BoletoDeVuelo;
import com.proyecto.xatruch_backend.Models.EscalaVuelo;
import com.proyecto.xatruch_backend.Models.Usuario;
import com.proyecto.xatruch_backend.Repositories.AsientoRepository;
import com.proyecto.xatruch_backend.Repositories.BoletoDeEscalaRepository;
import com.proyecto.xatruch_backend.Repositories.BoletoDeVueloRepository;
import com.proyecto.xatruch_backend.Repositories.EscalaVueloRepository;
import com.proyecto.xatruch_backend.Repositories.UsuarioRepository;
import com.proyecto.xatruch_backend.Services.BoletoDeVueloService;

import jakarta.transaction.Transactional;

@Service
public class BoletoDeVueloServiceImpl implements BoletoDeVueloService{

    @Autowired
    private BoletoDeVueloRepository boletoDeVueloRepository;

    @Autowired
    private AsientoRepository asientoRepository;

    @Autowired
    private BoletoDeEscalaRepository boletoDeEscalaRepository;

    @Autowired
    private EscalaVueloRepository escalaVueloRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public List<BoletoDeVuelo> obtenerTodosPorIdUsuario(int usuario) {
        return this.boletoDeVueloRepository.findBoletoDeVueloByUsuarioIdUsuario(usuario);
        
    }

    @Override
    public List<BoletoDeVuelo> obtenerTodos() {
        return this.boletoDeVueloRepository.findAll();
    }

    @Override
    public String eliminarBoletoDeVuelo(int idBoletoDeVuelo) {
        BoletoDeVuelo boleto = this.boletoDeVueloRepository.findById(idBoletoDeVuelo).get();
        if(boleto !=null){
            this.boletoDeVueloRepository.delete(boleto);
            return "Se elimino el boleto con Id: " + boleto.getIdBoletoDeVuelo();
        }
        return "No se encontro el boleto con Id: " + boleto.getIdBoletoDeVuelo();
    }

    @Override
    @Transactional
    public BoletoDeVuelo crear(int idUsuario, int idAsiento) {

        Asiento asiento = this.asientoRepository.findById(idAsiento).get();
        Usuario usuario = this.usuarioRepository.findById(idUsuario).get();

        asiento.setDisponible(false);
        BoletoDeVuelo boleto = new BoletoDeVuelo();
        boleto.setAsiento(asiento);
        boleto.setUsuario(usuario);

        BoletoDeVuelo boletoSve = this.boletoDeVueloRepository.save(boleto);
        
        List<EscalaVuelo> escalas = this.escalaVueloRepository.findEscalaVueloByVueloIdVuelo(asiento.getVuelo().getIdVuelo());
        
        for (EscalaVuelo escala : escalas) {
            BoletoDeEscala boletoDeEscala = new BoletoDeEscala();
            boletoDeEscala.setEscala(escala.getEscala());
            boletoDeEscala.setBoletoDeVuelo(boletoSve);

            this.boletoDeEscalaRepository.save(boletoDeEscala);
        }

        return boletoSve;
    }
    
}
