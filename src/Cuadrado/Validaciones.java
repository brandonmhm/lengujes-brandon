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
public class Validaciones {
    
    public static void validar(float valor)throws NumeroNoNegativoException{
    if (valor<0)throw new NumeroNoNegativoException();
    }    
    
        public static void validar(float valor)throws FueraDeRangoException{
         if(valor>20 ||valor<10) throw new FueraDeRangoException();
            
        } 
             
    
        
        
}
