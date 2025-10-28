package com.tpo.domain.strategy.matchmaking;

import com.tpo.domain.model.Busqueda;
import com.tpo.domain.model.Usuario;

import java.util.List;

public interface IEstrategiaEmparejamiento {
    void emparejar(Busqueda busqueda, List<Usuario> jugadoresDisponibles);
}
