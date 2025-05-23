package com.example.GestionDeUsuarios.controller;

import com.example.GestionDeUsuarios.entities.Gestion;
import com.example.GestionDeUsuarios.service.GestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

import java.util.List;

@RestController
@RequestMapping("/api/gestiones")
public class GestionController {

    @Autowired
    private GestionService gestionService;

    // Metodo para listar todas las gestiones
    @GetMapping
    public List<Gestion> listarGestiones() {
        return gestionService.getGestiones();
    }

    // Metodo para agregar una nueva gestión
    @PostMapping
    public Gestion agregarGestion(@RequestBody Gestion gestion) {
        return gestionService.saveGestion(gestion);
    }

    // Metodo para actualizar una gestión existente
    @PutMapping("/{id}")
    public Gestion actualizarGestion(@PathVariable int id, @RequestBody Gestion gestion) {
        return gestionService.updateGestion(gestion);
    }

    // Metodo para eliminar una gestión
    @DeleteMapping("/{id}")
    public String eliminarGestion(@PathVariable int id) {

        if (gestionService.deleteGestion(id)) {
            return "usuario eliminada";
        } else {
            return "usuario no encontrado";
        }
    }
}

