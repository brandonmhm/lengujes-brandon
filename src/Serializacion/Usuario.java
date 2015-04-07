/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Serializacion;

import java.io.Serializable;

/**
 *
 * @author T-107
 */
public class Usuario implements Serializable {
    
    private String nombre;
    private Float sueldo;
    private String email;

    public Usuario(String nombre, Float sueldo, String email) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.email = email;
    }

    public Usuario() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Float getSueldo() {
        return sueldo;
    }

    public void setSueldo(Float sueldo) {
        this.sueldo = sueldo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}

