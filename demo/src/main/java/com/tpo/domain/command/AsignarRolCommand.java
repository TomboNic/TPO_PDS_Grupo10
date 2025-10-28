package com.tpo.domain.command;

import com.tpo.domain.model.Rol;
import com.tpo.domain.model.Scrim;
import com.tpo.domain.model.Usuario;

public class AsignarRolCommand implements ICommandEquipo {
    private final Usuario jugador;
    private Rol rolAnterior;
    private final Rol rolNuevo;
    private final Scrim scrim;

    public AsignarRolCommand(Usuario jugador, Rol rolNuevo, Scrim scrim) {
        this.jugador = jugador;
        this.rolNuevo = rolNuevo;
        this.scrim = scrim;
    }

    @Override
    public void ejecutar() { /* aplicar cambio y guardar rolAnterior */ }

    @Override
    public void undo() { /* revertir al rolAnterior */ }
}
