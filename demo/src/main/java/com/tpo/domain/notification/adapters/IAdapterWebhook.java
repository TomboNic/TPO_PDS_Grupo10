package com.tpo.domain.notification.adapters;

import com.tpo.domain.notification.model.Notificacion;

public interface IAdapterWebhook {
    void enviar(Notificacion notf);
}
