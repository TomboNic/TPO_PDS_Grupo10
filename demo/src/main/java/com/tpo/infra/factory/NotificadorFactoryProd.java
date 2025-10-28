package com.tpo.infra.factory;

import com.tpo.domain.notification.Notificador;
import com.tpo.domain.notification.factory.INotificadorFactory;
import com.tpo.domain.notification.strategies.Email;
import com.tpo.infra.adapters.JavaMailAdapterFake;

public class NotificadorFactoryProd implements INotificadorFactory {
    @Override
    public Notificador crearNotificador() {
        return new Notificador(new Email(new JavaMailAdapterFake()));
    }
}

