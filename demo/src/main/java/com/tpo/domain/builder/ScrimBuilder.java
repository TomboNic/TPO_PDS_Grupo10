package com.tpo.domain.builder;

import com.tpo.domain.enums.Formato;
import com.tpo.domain.enums.Modalidad;
import com.tpo.domain.model.Region;
import com.tpo.domain.model.Juego;
import com.tpo.domain.model.Scrim;
import com.tpo.observer.DomainEventBus;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.atomic.AtomicInteger;

public class ScrimBuilder {
    private static final AtomicInteger SEQ = new AtomicInteger(1);
    private Juego juego;
    private Formato formato;
    private Region region;
    private int rangoMin;
    private int rangoMax;
    private float latenciaMax;
    private Instant fecha;
    private Duration duracion;
    private int cuposPorLado;

    public ScrimBuilder juego(Juego j) { this.juego = j; return this; }
    public ScrimBuilder formato(Formato f) { this.formato = f; return this; }
    public ScrimBuilder region(Region r) { this.region = r; return this; }
    public ScrimBuilder rango(int min, int max) { this.rangoMin = min; this.rangoMax = max; return this; }
    public ScrimBuilder latenciaMax(float ms) { this.latenciaMax = ms; return this; }
    public ScrimBuilder fecha(Instant t) { this.fecha = t; return this; }
    public ScrimBuilder duracion(Duration d) { this.duracion = d; return this; }
    public ScrimBuilder cuposPorLado(int n) { this.cuposPorLado = n; return this; }

    public Scrim build(DomainEventBus bus) {
        return new Scrim(SEQ.getAndIncrement());
    }
}
