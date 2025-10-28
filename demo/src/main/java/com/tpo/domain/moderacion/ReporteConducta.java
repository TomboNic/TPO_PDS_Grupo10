package com.tpo.domain.moderacion;

import com.tpo.domain.enums.Estado;
import com.tpo.domain.enums.TipoPenalidad;
import com.tpo.domain.model.Scrim;
import com.tpo.domain.model.Usuario;

import java.time.Instant;

public class ReporteConducta {
    private int idReporte;
    private Usuario reportante;
    private Usuario denunciado;
    private TipoPenalidad motivo;
    private String descripcion;
    private Instant fecha;
    private Estado estado;
    private Scrim scrim;
    private String sancion;

    public void resolver() { this.estado = Estado.Aprobado; }
}

