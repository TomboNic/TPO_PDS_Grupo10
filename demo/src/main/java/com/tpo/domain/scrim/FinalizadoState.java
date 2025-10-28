package com.tpo.domain.scrim;

import com.tpo.domain.model.Feedback;
import com.tpo.domain.model.Resultado;
import com.tpo.domain.model.Rol;
import com.tpo.domain.model.Usuario;

public class FinalizadoState implements ScrimState {
    public Resultado registrarResultado() { return new Resultado(); }
    public Feedback registrarFeedback() { return new Feedback(); }

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
    public String nombre() { return "Finalizado"; }
}
