package com.tpo.domain.command;

import com.tpo.domain.model.Scrim;
import com.tpo.domain.model.Usuario;

public class SwapJugadoresCommand implements ICommandEquipo {
    private final Usuario jugador1;
    private final Usuario jugador2;
    private final Scrim scrim;

    public SwapJugadoresCommand(Usuario jugador1, Usuario jugador2, Scrim scrim) {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        this.scrim = scrim;
    }

    @Override
    public void ejecutar() { /* intercambiar equipos */ }

    @Override
    public void undo() { /* revertir swap */ }
}
