package com.tpo.domain.notification.adapters;

import com.tpo.domain.notification.model.Notificacion;

public interface IAdapterFirebase {
    void enviar(Notificacion notf);
}
