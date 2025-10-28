package com.tpo.domain.model;

import com.tpo.domain.strategy.matchmaking.IEstrategiaEmparejamiento;

import java.util.ArrayList;
import java.util.List;

public class Juego {
    private String nombre;
    private List<Rol> rolesDisponibles = new ArrayList<>();
    private List<Region> regionesSoportadas = new ArrayList<>();
    private List<Rango> rangosDisponibles = new ArrayList<>();
    private IEstrategiaEmparejamiento reglasEmparejamiento;

    public Juego(String nombre) { this.nombre = nombre; }

    public void agregarRol(Rol r) { rolesDisponibles.add(r); }
    public void agregaRango(Rango r) { rangosDisponibles.add(r); }
    public void agregarRegion(Region r) { regionesSoportadas.add(r); }
    public void eliminarRol() {}
    public void eliminarRango() {}
    public void eliminarRegion() {}

    public String getNombre() { return nombre; }
    public IEstrategiaEmparejamiento getReglasEmparejamiento() { return reglasEmparejamiento; }
}
