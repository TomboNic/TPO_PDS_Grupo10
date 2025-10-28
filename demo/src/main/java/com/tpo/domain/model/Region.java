package com.tpo.domain.model;

public class Region {
    private String nombre;
    private String servidor;
    private float latenciaPromedio;

    public Region(String nombre) { this.nombre = nombre; }

    public void modificarLatencia() {}

    public String getNombre() { return nombre; }
}
