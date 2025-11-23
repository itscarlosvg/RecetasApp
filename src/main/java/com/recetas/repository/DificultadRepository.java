package com.recetas.repository;

import com.recetas.model.Dificultad;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DificultadRepository extends JpaRepository<Dificultad, Integer> { }
