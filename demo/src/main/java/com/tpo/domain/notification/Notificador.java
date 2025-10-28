package com.tpo.domain.notification;

import com.tpo.domain.notification.model.Notificacion;

public class Notificador {
    private IEstrategiaNotificacion estrategia;

    public Notificador(IEstrategiaNotificacion estrategia) { this.estrategia = estrategia; }

    public void enviar(Notificacion notif) { if (estrategia != null) estrategia.enviar(notif); }
    public void modificarEstrategia(IEstrategiaNotificacion est) { this.estrategia = est; }
}
