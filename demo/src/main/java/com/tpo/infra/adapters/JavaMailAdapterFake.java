package com.tpo.infra.adapters;

import com.tpo.domain.notification.adapters.IAdapterJavaMail;
import com.tpo.domain.notification.model.Notificacion;

public class JavaMailAdapterFake implements IAdapterJavaMail {
    @Override
    public void enviar(Notificacion notf) {
        System.out.println("[FAKE JavaMail] to user id=" + (notf.getDestinatario()!=null?notf.getDestinatario().getIdUsuario():"?") +
                " body=" + notf.getContenido());
    }
}
