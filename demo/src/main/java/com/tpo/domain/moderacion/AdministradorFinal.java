package com.tpo.domain.moderacion;

public class AdministradorFinal implements IManejadorReporte {
    private IManejadorReporte siguiente;
    @Override public void manejar(ReporteConducta reporte) { /* último eslabón */ }
    @Override public void setSiguiente(IManejadorReporte m) { this.siguiente = m; }
}

