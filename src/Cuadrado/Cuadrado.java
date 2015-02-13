/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cuadrado;

/**
 *
 * @author T-301
 */
public class Cuadrado {
    
    private float lado;
//constructor que diseñe por mi y se debe de 
    //crear el constructor por defecto
    public Cuadrado(float lado) {
        this.lado = lado;
    }
//constructor por defecto se debe de volver 
    //a crear 
    public Cuadrado() {
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }
    
    public float calcularArea(){
        float area=lado*lado;
               return area;
                
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
