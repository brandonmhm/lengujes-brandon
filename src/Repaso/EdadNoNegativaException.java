/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repaso;

/**
 *
 * @author T-107
 */
public class EdadNoNegativaException extends Exception{
    public EdadNoNegativaException(){
    super("no se aceptan edades negativas");
    }
    
}
