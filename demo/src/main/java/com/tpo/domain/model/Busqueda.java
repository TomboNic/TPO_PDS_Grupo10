package com.tpo.domain.model;

import com.tpo.domain.enums.Formato;
import com.tpo.domain.enums.Modalidad;

import java.time.Instant;

public class Busqueda {
    private int idBusqueda;
    private Usuario usuario;
    private Juego juego;
    private Formato formato;
    private int rangoMinimo;
    private int rangoMaximo;
    private float latenciaMaxima;
    private Region region;
    private Instant fechaHora;
    private boolean activa;
    private Modalidad modalidad;

    public void desactivarBusqueda() { this.activa = false; }
    public void guardarBusqueda() {}
    public void eliminarBusqueda() {}
    public void verificarCoincidencias(java.util.List<Scrim> scrims) {}
    public void crearAlerta() {}
}

