package com.tpo.domain.notification.model;

import com.tpo.domain.model.Usuario;

public class Notificacion {
    private String contenido;
    private Usuario destinatario;
    private int idNotificacion;
    private String tipoNotificacion;
    private com.tpo.domain.notification.IEstrategiaNotificacion canal;

    public Notificacion(String contenido, Usuario destinatario) {
        this.contenido = contenido;
        this.destinatario = destinatario;
    }

    public String getContenido() { return contenido; }
    public Usuario getDestinatario() { return destinatario; }
}
