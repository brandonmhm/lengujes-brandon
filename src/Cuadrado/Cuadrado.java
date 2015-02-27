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
public class Cuadrado implements Superficies{
    
    private float lado;
/**
 * Este constructor tiene un argumento de tipo flotante
 * @param lado El parametro que debes ingresar es el valor del lado de tu cuadrado
 */
//constructor que diseñe por mi y se debe de 
    //crear el constructor por defecto
    public Cuadrado(float lado)  {
       //en esta validacion no era necesario usar new pork no es privado
       // ValidarValores.ValidarValorNoNegativo.validar(lado);
        this.lado = lado;
    }
//constructor por defecto se debe de volver 
    //a crear 
    public Cuadrado() {
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado){
  
        this.lado = lado;
    }
    
    @Override
    public float CalcularArea(){
        System.out.print("El area del cuadrado es:");
        float area=lado*lado;
               return area;
                
    }

    
    
  //solo omite este este renglon
    
    /*
    este omite multiples arreglos
    */
    
    /**
     este sirve para hacer mi documentacion 
     */
     
    
    
    
    
    
    
    
    
    
    
}
