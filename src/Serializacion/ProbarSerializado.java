/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Serializacion;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author T-107
 */
public class ProbarSerializado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creamos un usuario
        Usuario u=new  Usuario();
        u.setEmail("rapidclimate@gmail.com");
        u.setNombre("juan carlos");
        u.setSueldo(40000f);
        //lo guardamos
        PersistenciaUsuario per=new PersistenciaUsuario();
        try {
            per.Guardar(u);
            System.out.println("Usuario guardado con exito");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
                                }
                                            }
    
}
