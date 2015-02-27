/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cuadrado;

import java.util.*;

/**
 *
 * @author T-301
 */
public class GenerarSuperficies {
    public static ArrayList<Superficies> obtenerFiguras()throws Exception{
    ArrayList<Superficies> figuritas=new ArrayList<Superficies>();
    //primero creamos cuadrados
        Cuadrado cu1=new Cuadrado(12);
        Cuadrado cu2=new Cuadrado(14);
        Cuadrado cu3=new Cuadrado(13);
        
        Rectangulo re1=new Rectangulo(12,5);
        Rectangulo re2=new Rectangulo(18,2);
        Rectangulo re3=new Rectangulo(10,8);
        
        Circulo ci1=new Circulo(30);
        Circulo ci2=new Circulo(15);
        Circulo ci3=new Circulo(8);
        
        figuritas.add(cu1);
        figuritas.add(cu2);
        figuritas.add(cu3);
        figuritas.add(re1);
        figuritas.add(re2);
        figuritas.add(re3);
        figuritas.add(ci1);
        figuritas.add(ci2);
        figuritas.add(ci3);
        return figuritas;
        
        
        
                
    }

    
    
}
