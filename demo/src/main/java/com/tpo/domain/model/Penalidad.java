package com.tpo.domain.model;

import com.tpo.domain.enums.TipoPenalidad;

import java.time.Instant;

public class Penalidad {
    private int idPenalidad;
    private Usuario usuario;
    private String descripcion;
    private Instant fecha;
    private TipoPenalidad tipo;
    private int duracion;

    public void registrarPenalidad(Usuario u, String descripcion) {}
    public void eliminarPenalidad() {}
    public void bloquearTemporalmenteUsuario() {}
}

