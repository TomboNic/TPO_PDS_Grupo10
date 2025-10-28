package com.tpo.domain.scrim;

import com.tpo.domain.model.Rol;
import com.tpo.domain.model.Usuario;

public class BuscandoJugadoresState implements ScrimState {
    public void verificarCupoCompleto() {}

    @Override
    public void postular(ScrimContext ctx, Usuario u, Rol r) { /* agregar postulacion */ }

    @Override
    public void confirmar(ScrimContext ctx, Usuario u) { ctx.setState(new LobbyArmadoState()); }

    @Override
    public void iniciar(ScrimContext ctx) { }

    @Override
    public void finalizar(ScrimContext ctx) { }

    @Override
    public void cancelar(ScrimContext ctx) { ctx.setState(new CanceladoState()); }

    @Override
    public String nombre() { return "BuscandoJugadores"; }
}
