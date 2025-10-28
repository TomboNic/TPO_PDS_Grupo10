package com.tpo.infra.adapters;

import com.tpo.domain.notification.adapters.IAdapterFirebase;
import com.tpo.domain.notification.model.Notificacion;

public class FirebaseAdapterFake implements IAdapterFirebase {
    @Override
    public void enviar(Notificacion notf) {
        System.out.println("[FAKE Firebase] Push a usuario id=" + (notf.getDestinatario() != null ? notf.getDestinatario().getIdUsuario() : "?") +
                " msg=" + notf.getContenido());
    }
}
