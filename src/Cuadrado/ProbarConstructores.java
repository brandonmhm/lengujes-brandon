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
public class ProbarConstructores {
    
    public static void main (String args[]){
   //creamos un byte y lo inicialisamos
        byte b=2;
        short s=2;
        int i=2;
        long l=2;
        //este un casting ind
        b=(byte)s;
        //es un casting implicito o directo por que si cabe el byte en el short
        s=b;
   
        
        
        float f=45;
        //por defecto es un double y no cabe en un flotante 
        //por k es mas chico el float y debes ponerle una f
        //para que vea k es un flotante
        
//float f2=45.2f;
//lo cambiamos para k no halla problemas
        double dedos=45.2;
        int i2=300;
        Cuadrado c=new Cuadrado();
        
        
                
                
    }
    
}
