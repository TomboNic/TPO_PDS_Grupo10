package com.tpo.app.subscribers;

import com.tpo.domain.model.Usuario;
import com.tpo.domain.notification.factory.INotificadorFactory;
import com.tpo.domain.notification.model.Notificacion;
import com.tpo.observer.IDomainEvent;
import com.tpo.observer.ISubscriber;
import com.tpo.observer.events.ScrimStateChanged;

public class NotificationSubscriber implements ISubscriber {
    private final INotificadorFactory factory;

    public NotificationSubscriber(INotificadorFactory factory) { this.factory = factory; }

    @Override
    public void onEvent(IDomainEvent e) {
        var notificador = factory.crearNotificador();
        String msg = "Evento: " + e.getClass().getSimpleName();
        if (e instanceof ScrimStateChanged s) {
            msg += " -> estado=" + s.newState;
        }
        notificador.enviar(new Notificacion(msg, new Usuario()));
    }
}
