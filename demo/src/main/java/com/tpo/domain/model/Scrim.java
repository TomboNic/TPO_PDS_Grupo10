package com.tpo.domain.model;

import com.tpo.domain.enums.Formato;
import com.tpo.domain.enums.Modalidad;
import com.tpo.domain.scrim.EstadoScrim;
import com.tpo.domain.scrim.ScrimContext;
import com.tpo.domain.scrim.BuscandoJugadoresState;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class Scrim {
    private int idScrim;
    private Juego juego;
    private Formato formato;
    private int rangoMinimo;
    private int rangoMaximo;
    private float latenciaMaxima;
    private Region region;
    private Instant fechaHora;
    private EstadoScrim estado;
    private float duracionEstimada;
    private Usuario creador;
    private Modalidad modalidad;
    private int cupos;
    private List<Rol> reglasRoles = new ArrayList<>();
    private List<Usuario> equipo1 = new ArrayList<>();
    private List<Usuario> equipo2 = new ArrayList<>();
    private List<Usuario> suplentes = new ArrayList<>();

    private final ScrimContext context;

    public Scrim(int idScrim) {
        this.idScrim = idScrim;
        this.context = new ScrimContext(this);
        this.estado = new BuscandoJugadoresState();
    }

    public void postular(Usuario u, Rol r) { context.postular(u, r); }
    public void confirmar(Usuario u) { context.confirmar(u); }
    public void cancelar() { context.cancelar(); }
    public void iniciar() { context.iniciar(); }
    public void finalizar(Resultado r) { context.finalizar(); }

    public int getIdScrim() { return idScrim; }
    public ScrimContext getContext() { return context; }
}
