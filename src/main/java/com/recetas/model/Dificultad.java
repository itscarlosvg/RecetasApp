package com.recetas.model;

import jakarta.persistence.*;

@Entity
public class Dificultad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String dificultad;

    public Dificultad() {}

    public Dificultad(String dificultad) {
        this.dificultad = dificultad;
    }

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getDificultad() { return dificultad; }
    public void setDificultad(String dificultad) { this.dificultad = dificultad; }
}
