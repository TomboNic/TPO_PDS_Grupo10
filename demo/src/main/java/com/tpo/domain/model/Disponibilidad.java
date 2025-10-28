package com.tpo.domain.model;

import java.time.LocalTime;

public class Disponibilidad {
    private String diaSemana;
    private LocalTime horaInicio;
    private LocalTime horaFin;

    public Disponibilidad(String diaSemana, LocalTime horaInicio, LocalTime horaFin) {
        this.diaSemana = diaSemana;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
    }

    public void modificarDisponibilidad() {}

    public String getDiaSemana() { return diaSemana; }
    public LocalTime getHoraInicio() { return horaInicio; }
    public LocalTime getHoraFin() { return horaFin; }
}
