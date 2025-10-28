package com.tpo.domain.strategy.matchmaking;

import com.tpo.domain.model.Busqueda;
import com.tpo.domain.model.Usuario;

import java.util.List;

public class EstrategiaPorLatencia implements IEstrategiaEmparejamiento {
    private float latenciaMaxima;
    public float calcularDiferenciaLatencia(Usuario a, Usuario b) { return 0f; }
    @Override
    public void emparejar(Busqueda busqueda, List<Usuario> jugadoresDisponibles) { }
}
