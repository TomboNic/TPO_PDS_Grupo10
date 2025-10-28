package com.tpo.domain.model;

import com.tpo.domain.enums.TipoRol;

import java.util.ArrayList;
import java.util.List;

public class Rol {
    private String nombre;
    private TipoRol tipoRol;
    private List<Juego> juegosDisponibles = new ArrayList<>();

    public Rol(String nombre, TipoRol tipoRol) {
        this.nombre = nombre;
        this.tipoRol = tipoRol;
    }

    public void agregarJuego(Juego j) { juegosDisponibles.add(j); }
    public void eliminarJuego() {}
}

