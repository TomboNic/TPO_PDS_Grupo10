package com.tpo.domain.model;

import com.tpo.domain.enums.Estado;

import java.time.LocalDate;

public class Postulacion {
    private int idPostulacion;
    private LocalDate fechaPostulacion;
    private Estado estado;
    private Usuario postulante;
    private Scrim scrim;
    private Rol rolDeseado;

    public void aprobar() { this.estado = Estado.Aprobado; }
    public void rechazar() { this.estado = Estado.Rechazado; }
}

