package com.tpo.domain.calendario;

import com.tpo.domain.model.Scrim;

import java.util.ArrayList;
import java.util.List;

public class Calendario {
    private ICalendarAdapter adapter;
    private List<Scrim> eventos = new ArrayList<>();

    public void crearEvento(Scrim scrim) { eventos.add(scrim); if (adapter!=null) adapter.crearEvento(scrim); }
    public void eliminarEvento(Scrim scrim) { eventos.remove(scrim); if (adapter!=null) adapter.eliminarEvento(scrim); }
    public void actualizarEvento(Scrim scrim) { if (adapter!=null) adapter.actualizarEvento(scrim); }
    public void programarRecordatorio() {}
}

