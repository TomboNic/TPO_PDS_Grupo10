package com.tpo.domain.moderacion;

public interface IManejadorReporte {
    void manejar(ReporteConducta reporte);
    void setSiguiente(IManejadorReporte m);
}

