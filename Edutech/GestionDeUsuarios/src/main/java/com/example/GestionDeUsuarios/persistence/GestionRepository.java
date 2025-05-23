package com.example.GestionDeUsuarios.persistence;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.GestionDeUsuarios.entities.Gestion;

@Repository
public interface GestionRepository extends CrudRepository<Gestion, Integer> {

}
