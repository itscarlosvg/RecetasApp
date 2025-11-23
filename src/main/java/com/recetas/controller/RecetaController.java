package com.recetas.controller;

import com.recetas.model.Receta;
import com.recetas.model.Dificultad;
import com.recetas.repository.RecetaRepository;
import com.recetas.repository.DificultadRepository;
import com.recetas.dto.RecetaDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class RecetaController {

    private final RecetaRepository recetaRepo;
    private final DificultadRepository dificultadRepo;

    public RecetaController(RecetaRepository recetaRepo, DificultadRepository dificultadRepo){
        this.recetaRepo = recetaRepo;
        this.dificultadRepo = dificultadRepo;
    }

    @GetMapping("/recetas")
    public List<Receta> getRecetas() {
        return recetaRepo.findAll();
    }

    @PostMapping("/recetas")
    public Receta addReceta(@RequestBody RecetaDTO recetaDTO) {
        System.out.println("=== DEBUG: Recibiendo RecetaDTO ===");
        System.out.println("Nombre: " + recetaDTO.getNombre());
        System.out.println("DificultadId: " + recetaDTO.getDificultadId());
        System.out.println("Tipo de DificultadId: " + (recetaDTO.getDificultadId() != null ? recetaDTO.getDificultadId().getClass().getSimpleName() : "null"));

        try {
            Dificultad dif = dificultadRepo.findById(recetaDTO.getDificultadId())
                    .orElseThrow(() -> new RuntimeException("Dificultad no encontrada"));

            System.out.println("=== DEBUG: Dificultad encontrada ===");
            System.out.println("Dificultad ID: " + dif.getId());
            System.out.println("Dificultad Nombre: " + dif.getDificultad());

            Receta receta = new Receta();
            receta.setNombre(recetaDTO.getNombre());
            receta.setDificultad(dif);

            System.out.println("=== DEBUG: Receta a guardar ===");
            System.out.println("Receta Nombre: " + receta.getNombre());
            System.out.println("Receta Dificultad: " + (receta.getDificultad() != null ? receta.getDificultad().getId() + " - " + receta.getDificultad().getDificultad() : "null"));

            Receta savedReceta = recetaRepo.save(receta);

            System.out.println("=== DEBUG: Receta guardada ===");
            System.out.println("Receta ID: " + savedReceta.getId());
            System.out.println("Receta Dificultad después de guardar: " + (savedReceta.getDificultad() != null ? savedReceta.getDificultad().getId() + " - " + savedReceta.getDificultad().getDificultad() : "null"));

            return savedReceta;
        } catch (Exception e) {
            System.out.println("=== DEBUG: Error ===");
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
            throw e;
        }
    }

    @GetMapping("/dificultades")
    public List<Dificultad> getDificultades() {
        return dificultadRepo.findAll();
    }
}
