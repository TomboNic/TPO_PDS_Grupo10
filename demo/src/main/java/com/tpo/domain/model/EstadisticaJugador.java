package com.tpo.domain.model;

public class EstadisticaJugador {
    private Usuario usuario;
    private int kills;
    private int assist;
    private int deaths;
    private float rating;
    private Scrim scrim;
    private int idEstadistica;
    private String observaciones;

    public void registrarEstadisticas(int k, int a, int d, float r) {
        this.kills = k; this.assist = a; this.deaths = d; this.rating = r;
    }
}

