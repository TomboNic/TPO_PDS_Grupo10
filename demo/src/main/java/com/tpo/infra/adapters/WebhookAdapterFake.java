package com.tpo.infra.adapters;

import com.tpo.domain.notification.adapters.IAdapterWebhook;
import com.tpo.domain.notification.model.Notificacion;

public class WebhookAdapterFake implements IAdapterWebhook {
    @Override
    public void enviar(Notificacion notf) {
        System.out.println("[FAKE Webhook] payload=" + notf.getContenido());
    }
}
