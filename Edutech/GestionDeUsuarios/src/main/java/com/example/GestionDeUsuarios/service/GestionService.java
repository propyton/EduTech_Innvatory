package com.example.GestionDeUsuarios.service;

import com.example.GestionDeUsuarios.entities.Gestion;
import com.example.GestionDeUsuarios.persistence.GestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GestionService {
    @Autowired
    private GestionRepository gestionRepository;
    public List<Gestion> getGestiones() {
        return (List<Gestion>) gestionRepository.findAll();
    }

    public Gestion saveGestion(Gestion gestion) {
        return gestionRepository.save(gestion);
    }

    public Gestion getGestionById(int id) {
        Optional<Gestion> optional = gestionRepository.findById(id);
        return optional.orElse(null);
    }

    public Gestion updateGestion(Gestion gestion) {
        return gestionRepository.save(gestion);
    }

    public boolean deleteGestion(int id) {
        if (gestionRepository.existsById(id)) {
            gestionRepository.deleteById(id);
            return true;
        }
        return false;

    }

}


