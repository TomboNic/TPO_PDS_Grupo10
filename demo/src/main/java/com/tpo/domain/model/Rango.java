package com.tpo.domain.model;

import java.util.ArrayList;
import java.util.List;

public class Rango {
    private String nombre;
    private List<Juego> juegosDisponibles = new ArrayList<>();
    private int limiteInferior;
    private int limiteSuperior;

    public Rango(String nombre, int limiteInferior, int limiteSuperior) {
        this.nombre = nombre;
        this.limiteInferior = limiteInferior;
        this.limiteSuperior = limiteSuperior;
    }

    public void agregarJuego(Juego j) { juegosDisponibles.add(j); }
    public void eliminarJuego() {}
    public void modificarLimiteInf() {}
    public void modificarLimiteSup() {}
}
