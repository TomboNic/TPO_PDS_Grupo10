package com.tpo.domain.model;

import com.tpo.domain.enums.EstadoMail;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nombre;
    private String apellido;
    private String nombreUsuario;
    private int idUsuario;
    private String email;
    private Juego juegoPrincipal;
    private Rango rango;
    private Rol rol;
    private Region region;
    private List<Disponibilidad> disponibilidadHoraria = new ArrayList<>();
    private EstadoMail estadoMail;
    private List<Penalidad> penalidades = new ArrayList<>();
    private String passwordHash;
    private List<Rol> rolesPreferidos = new ArrayList<>();
    private String preferencias;

    public void verificacionEmail() {}
    public void editarPerfil() {}

    public int getIdUsuario() { return idUsuario; }
    public String getNombreUsuario() { return nombreUsuario; }
}
