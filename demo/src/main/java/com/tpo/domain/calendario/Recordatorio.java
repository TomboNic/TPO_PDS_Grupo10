package com.tpo.domain.calendario;

import com.tpo.domain.model.Scrim;
import com.tpo.domain.model.Usuario;

import java.time.LocalDateTime;

public class Recordatorio {
    private LocalDateTime fechaHoraEvento;
    private int horasAntes;
    private String mensaje;
    private Usuario usuario;
    private Scrim scrim;

    public void activarNotificacion() {}
}

