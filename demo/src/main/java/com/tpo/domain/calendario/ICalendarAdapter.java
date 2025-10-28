package com.tpo.domain.calendario;

import com.tpo.domain.model.Scrim;

public interface ICalendarAdapter {
    void crearEvento(Scrim scrim);
    void eliminarEvento(Scrim scrim);
    void actualizarEvento(Scrim scrim);
}

