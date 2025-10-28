package com.tpo.domain.scrim;

import com.tpo.domain.model.Rol;
import com.tpo.domain.model.Usuario;

public class CanceladoState implements ScrimState {
    public void aplicarPenalidad() {}

    @Override
    public void postular(ScrimContext ctx, Usuario u, Rol r) { }
    @Override
    public void confirmar(ScrimContext ctx, Usuario u) { }
    @Override
    public void iniciar(ScrimContext ctx) { }
    @Override
    public void finalizar(ScrimContext ctx) { }
    @Override
    public void cancelar(ScrimContext ctx) { }
    @Override
    public String nombre() { return "Cancelado"; }
}
