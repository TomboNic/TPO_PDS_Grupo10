package com.tpo.domain.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Equipo {
    private int idEquipo;
    private String nombre;
    private LocalDate fechaCreacion;
    private List<Usuario> integrantes = new ArrayList<>();

    public void agregarJugador(Usuario j) { integrantes.add(j); }
    public void eliminarJugador(Usuario j) { integrantes.remove(j); }
}

