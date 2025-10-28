package com.tpo.domain.scrim;

import com.tpo.domain.model.Rol;
import com.tpo.domain.model.Usuario;

public class LobbyArmadoState implements ScrimState {
    public void verificarConfirmaciones() {}

    @Override
    public void postular(ScrimContext ctx, Usuario u, Rol r) { }
    @Override
    public void confirmar(ScrimContext ctx, Usuario u) { ctx.setState(new ConfirmadoState()); }
    @Override
    public void iniciar(ScrimContext ctx) { }
    @Override
    public void finalizar(ScrimContext ctx) { }
    @Override
    public void cancelar(ScrimContext ctx) { ctx.setState(new CanceladoState()); }
    @Override
    public String nombre() { return "LobbyArmado"; }
}
