package com.tpo.domain.strategy.matchmaking;

import com.tpo.domain.model.Busqueda;
import com.tpo.domain.model.Usuario;

import java.util.List;

public class EstrategiaPorCompatibilidad implements IEstrategiaEmparejamiento {
    private float pesoRoles;
    private float pesoHistorial;
    private float pesoFairPlay;

    public boolean calcularCompatibilidad(Usuario a, Usuario b) { return true; }

    @Override
    public void emparejar(Busqueda busqueda, List<Usuario> jugadoresDisponibles) { }
}
