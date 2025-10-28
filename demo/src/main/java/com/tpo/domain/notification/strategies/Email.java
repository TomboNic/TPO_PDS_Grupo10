package com.tpo.domain.notification.strategies;

import com.tpo.domain.notification.IEstrategiaNotificacion;
import com.tpo.domain.notification.adapters.IAdapterJavaMail;
import com.tpo.domain.notification.model.Notificacion;

public class Email implements IEstrategiaNotificacion {
    private final IAdapterJavaMail adapter;
    public Email(IAdapterJavaMail adapter) { this.adapter = adapter; }
    @Override
    public void enviar(Notificacion notf) { adapter.enviar(notf); }
}

