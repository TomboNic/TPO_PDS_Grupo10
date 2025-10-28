package com.tpo.domain.notification.strategies;

import com.tpo.domain.notification.IEstrategiaNotificacion;
import com.tpo.domain.notification.adapters.IAdapterFirebase;
import com.tpo.domain.notification.model.Notificacion;

public class Push implements IEstrategiaNotificacion {
    private final IAdapterFirebase adapter;
    public Push(IAdapterFirebase adapter) { this.adapter = adapter; }
    @Override
    public void enviar(Notificacion notf) { adapter.enviar(notf); }
}

