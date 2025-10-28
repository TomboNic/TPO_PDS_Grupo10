package com.tpo.domain.command;

import java.util.ArrayList;
import java.util.List;

public class GestorEquipos {
    public List<ICommandEquipo> historialComandos = new ArrayList<>();
    public void ejecutar(ICommandEquipo c) { historialComandos.add(c); c.ejecutar(); }
    public void undo() {
        if (!historialComandos.isEmpty()) {
            ICommandEquipo c = historialComandos.remove(historialComandos.size()-1);
            c.undo();
        }
    }
}
