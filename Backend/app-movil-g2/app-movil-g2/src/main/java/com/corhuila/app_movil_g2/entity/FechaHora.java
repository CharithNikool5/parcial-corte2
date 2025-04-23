package com.corhuila.app_movil_g2.entity;

import java.sql.Date;
import java.time.LocalTime;

import jakarta.persistence.Entity;

@Entity
public class FechaHora extends ABaseEntity{

    private Date fecha;
    private LocalTime hora;

     
    public Date getFecha() {
        return fecha;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public LocalTime getHora() {
        return hora;
    }
    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    

}


