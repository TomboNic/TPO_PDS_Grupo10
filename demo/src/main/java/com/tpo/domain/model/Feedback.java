package com.tpo.domain.model;

import com.tpo.domain.enums.Estado;

import java.time.Instant;

public class Feedback {
    private int idFeedback;
    private String descripcion;
    private Usuario usuario;
    private Estado estadoModeracion;
    private Instant fecha;
    private int rating;

    public void registrarFeedback(Usuario autor, String comentario, int rating) {}
    public void editarComentario(String texto) { this.descripcion = texto; }
}

