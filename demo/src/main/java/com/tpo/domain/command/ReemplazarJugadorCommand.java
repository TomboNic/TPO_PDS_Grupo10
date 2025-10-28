package com.tpo.domain.command;

import com.tpo.domain.model.Scrim;
import com.tpo.domain.model.Usuario;

public class ReemplazarJugadorCommand implements ICommandEquipo {
    private final Usuario jugadorSaliente;
    private final Usuario jugadorEntrante;
    private final Scrim scrim;

    public ReemplazarJugadorCommand(Usuario jugadorSaliente, Usuario jugadorEntrante, Scrim scrim) {
        this.jugadorSaliente = jugadorSaliente;
        this.jugadorEntrante = jugadorEntrante;
        this.scrim = scrim;
    }

    @Override
    public void ejecutar() { /* reemplazar jugador */ }

    @Override
    public void undo() { /* revertir reemplazo */ }
}

