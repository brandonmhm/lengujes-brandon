/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cuadrado;

/**
 *
 * @author T-107
 */
public class Triangulo implements Superficies{
   private float Base;
   private float Altura;

    public Triangulo() {
    }

    public Triangulo(float Base, float Altura) {
        this.Base = Base;
        this.Altura = Altura;
    }
    
    public float CalcularArea(){
        System.out.print("El area del Triangulo es");
    return (Base*Altura)/2;
    }

    public float getBase() {
        return Base;
    }

    public float getAltura() {
        return Altura;
    }
}

 
