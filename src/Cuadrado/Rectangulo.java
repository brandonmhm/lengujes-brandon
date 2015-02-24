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
public class Rectangulo {
    private float LadoMayor;
    private float LadoMenor;

    public Rectangulo() {
    }

    public Rectangulo(float LadoMayor, float LadoMenor) {
        this.LadoMayor = LadoMayor;
        this.LadoMenor = LadoMenor;
    }
    public float calcularArea(){
    return LadoMayor*LadoMenor;
    
    }
    public float getLadoMayor() {
        return LadoMayor;
    }

    public float getLadoMenor() {
        return LadoMenor;
    }
    
}
