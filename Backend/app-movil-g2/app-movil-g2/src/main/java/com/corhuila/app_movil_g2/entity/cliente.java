package com.corhuila.app_movil_g2.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class cliente extends ABaseEntity {


    
   
    @Column(name = "nombre", length = 50)
    private String nombre;

    @Column(name = "apellido", length = 50)
    private String apellido;

    @Column(name = "identificacion", length = 20)
    private String numIdentidad;

    @Column(name = "telefono", length = 10)
    private String telefono;

    @Column(name = "direccion", length = 50)
    private String direccion;



    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNumIdentidad() {
        return numIdentidad;
    }
    public void setNumIdentidad(String numIdentidad) {
        this.numIdentidad = numIdentidad;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String Telefono) {
        telefono = Telefono;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String Direccion) {
        direccion = Direccion;
    }

    

}
