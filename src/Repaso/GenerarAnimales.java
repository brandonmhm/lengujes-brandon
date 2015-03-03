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
import java.util.*;
public class GenerarAnimales {
    public static ArrayList <Animal> generarAnimales(){
        
    ArrayList <Animal> animales=new ArrayList<Animal>();
    Animal a1=new Animal("leon",2);
    Animal a2=new Animal("delfin",6);
    animales.add(a1);
    animales.add(a2);
    return animales;
    }

   
}
