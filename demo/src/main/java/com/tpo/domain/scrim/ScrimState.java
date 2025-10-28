package com.tpo.domain.scrim;

import com.tpo.domain.model.Rol;
import com.tpo.domain.model.Usuario;

public interface ScrimState extends EstadoScrim {
    void postular(ScrimContext ctx, Usuario u, Rol r);
    void confirmar(ScrimContext ctx, Usuario u);
    void iniciar(ScrimContext ctx);
    void finalizar(ScrimContext ctx);
    void cancelar(ScrimContext ctx);
    String nombre();

    @Override
    default void cambiarEstado() { /* marker per UML */ }
}
