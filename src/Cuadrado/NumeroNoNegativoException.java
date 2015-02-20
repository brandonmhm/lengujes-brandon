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
//exception .-hereda aaaaa
import java.lang.Exception;
public class NumeroNoNegativoException extends Exception{
    public NumeroNoNegativoException()
    {
    super("lo siento pero no acepto numeros negativos");
    }
    
}
