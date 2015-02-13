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
public class Arreglos1 {
     public static void main (String args[]){
         //declaro el arreglo y lo inicializo
         int x[]=new int[3];
         int []y=new int[3];
         int z[]={1,-200,45};
         //incorrectos
         //int w=nwe int [];
         //int j[3]=new int [];
         //int m[4]=new int [4];
         // int []n={1,4.5,3}; en este no se puede por tiene un flotante y te esta pidiendo enteros
         //asignamos valores a los indices del arreglo
         x[0]=127;
         x[1]=200;
         x[2]=-23;
         //Iterar es hacer el recorrido
         for(int i=0;i<x.length;i++)
             System.out.println(x[i]);
         
     }
}
