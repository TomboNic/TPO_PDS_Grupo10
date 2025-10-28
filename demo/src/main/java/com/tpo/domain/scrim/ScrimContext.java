package com.tpo.domain.scrim;

import com.tpo.domain.model.Rol;
import com.tpo.domain.model.Scrim;
import com.tpo.domain.model.Usuario;

public class ScrimContext {
    private ScrimState state;
    private final Scrim scrim;

    public ScrimContext(Scrim scrim) {
        this.scrim = scrim;
        this.state = new BuscandoJugadoresState();
    }

    public void setState(ScrimState state) { this.state = state; }

    public void postular(Usuario u, Rol r) { state.postular(this, u, r); }
    public void confirmar(Usuario u) { state.confirmar(this, u); }
    public void iniciar() { state.iniciar(this); }
    public void finalizar() { state.finalizar(this); }
    public void cancelar() { state.cancelar(this); }

    public ScrimState getState() { return state; }
    public Scrim getScrim() { return scrim; }
}
