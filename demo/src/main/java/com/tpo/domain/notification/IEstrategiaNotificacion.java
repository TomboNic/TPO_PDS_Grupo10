package com.tpo.domain.notification;

import com.tpo.domain.notification.model.Notificacion;

public interface IEstrategiaNotificacion {
    void enviar(Notificacion notf);
}
