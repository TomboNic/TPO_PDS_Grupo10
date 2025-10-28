package com.tpo.domain.strategy.matchmaking;

import com.tpo.domain.model.Busqueda;
import com.tpo.domain.model.Usuario;

import java.util.List;

public class GestorEmparejamiento {
    private IEstrategiaEmparejamiento estrategia;

    public void modificarEstrategia(IEstrategiaEmparejamiento e) { this.estrategia = e; }
    public void emparejar(Busqueda busqueda, List<Usuario> jugadoresDisponibles) {
        if (estrategia != null) estrategia.emparejar(busqueda, jugadoresDisponibles);
    }
}

