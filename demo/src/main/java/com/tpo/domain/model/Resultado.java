package com.tpo.domain.model;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class Resultado {
    private int idResultado;
    private Scrim scrim;
    private List<Usuario> ganadores = new ArrayList<>();
    private Instant fecha;
    private List<EstadisticaJugador> estadisticasJugadores = new ArrayList<>();
    private Usuario MVP;
    private Feedback feedback;

    public void registrarResultado(Scrim scrim, List<Usuario> ganadores) {}
    public void agregarFeedback(Feedback f) { this.feedback = f; }
    public void calcularMVP() {}
}

