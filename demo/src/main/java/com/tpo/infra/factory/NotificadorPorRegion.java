package com.tpo.infra.factory;

import com.tpo.domain.model.Region;
import com.tpo.domain.notification.Notificador;
import com.tpo.domain.notification.factory.INotificadorFactory;
import com.tpo.domain.notification.strategies.Push;
import com.tpo.infra.adapters.FirebaseAdapterFake;

public class NotificadorPorRegion implements INotificadorFactory {
    private final Region region;
    public NotificadorPorRegion(Region region) { this.region = region; }
    @Override
    public Notificador crearNotificador() {
        // Simplificación: siempre Push, se podría variar según region
        return new Notificador(new Push(new FirebaseAdapterFake()));
    }
}

