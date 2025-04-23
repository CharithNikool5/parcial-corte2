package com.corhuila.app_movil_g2.entity;

import jakarta.persistence.Entity;

@Entity
public class Mesas extends ABaseEntity {

    private String NumeroMesa;
    private int capacidad;
    private boolean disponibilidad;



    public String getNumeroMesa() {
        return NumeroMesa;
    }
    public void setNumeroMesa(String numeroMesa) {
        NumeroMesa = numeroMesa;
    }
    public int getCapacidad() {
        return capacidad;
    }
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    public boolean isDisponibilidad() {
        return disponibilidad;
    }
    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    


}
