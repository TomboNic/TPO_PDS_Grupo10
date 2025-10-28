package com.tpo.domain.notification.strategies;

import com.tpo.domain.notification.IEstrategiaNotificacion;
import com.tpo.domain.notification.adapters.IAdapterWebhook;
import com.tpo.domain.notification.model.Notificacion;

public class Discord implements IEstrategiaNotificacion {
    private final IAdapterWebhook adapter;
    public Discord(IAdapterWebhook adapter) { this.adapter = adapter; }
    @Override
    public void enviar(Notificacion notf) { adapter.enviar(notf); }
}

