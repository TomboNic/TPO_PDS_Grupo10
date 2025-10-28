package com.tpo.infra.factory;

import com.tpo.domain.notification.Notificador;
import com.tpo.domain.notification.factory.INotificadorFactory;
import com.tpo.domain.notification.strategies.Email;
import com.tpo.domain.notification.strategies.Push;
import com.tpo.infra.adapters.FirebaseAdapterFake;
import com.tpo.infra.adapters.JavaMailAdapterFake;

public class NotificadorFactoryDev implements INotificadorFactory {
    @Override
    public Notificador crearNotificador() {
        // Por defecto, usar Push para dev (could be Email)
        return new Notificador(new Push(new FirebaseAdapterFake()));
    }
}
