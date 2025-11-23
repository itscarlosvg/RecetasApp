package com.recetas.dto;

public class RecetaDTO {
    private String nombre;
    private Integer dificultadId;

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public Integer getDificultadId() { return dificultadId; }
    public void setDificultadId(Integer dificultadId) { this.dificultadId = dificultadId; }
}
