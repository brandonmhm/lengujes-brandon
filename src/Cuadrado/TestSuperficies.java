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
public class TestSuperficies {
    public static void main(String[] args) throws Exception {
        
     //aqui se aplica el polimorfismo
     for(Superficies s:GenerarSuperficies.obtenerFiguras())
             {
                 System.out.println(s.CalcularArea());
           }
        
    }
   
}
