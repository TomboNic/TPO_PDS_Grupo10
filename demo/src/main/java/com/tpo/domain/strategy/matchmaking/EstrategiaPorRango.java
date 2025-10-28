package com.tpo.domain.strategy.matchmaking;

import com.tpo.domain.model.Busqueda;
import com.tpo.domain.model.Usuario;

import java.util.List;

public class EstrategiaPorRango implements IEstrategiaEmparejamiento {
    private final int diferenciaMaxima;

    public EstrategiaPorRango(int diferenciaMaxima) {
        this.diferenciaMaxima = diferenciaMaxima;
    }

    public int calcularDiferenciaRango(Usuario a, Usuario b) { return 0; }

    @Override
    public void emparejar(Busqueda busqueda, List<Usuario> jugadoresDisponibles) { }
}
