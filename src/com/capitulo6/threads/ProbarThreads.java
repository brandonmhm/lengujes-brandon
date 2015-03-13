/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.capitulo6.threads;

/**
 *
 * @author T-301
 */
public class ProbarThreads {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("probar Threads");
    //paso1 Crearlo
        Facil t1=new Facil();
         Facil t11=new Facil();
         Relojito treloj=new Relojito();
        Regular r1=new Regular();
        Thread t2=new Thread(r1);
        Thread t3=new  Thread(new Runnable(){

            @Override
            public void run() {
                System.out.println("soy un Thread mucho mejor");    
            }
        
        }
        );
        
//esto es para crearle un nombre
        //t1.setName("petra");
    //paso 2 inicializado
        t1.start();
        t11.start();
        t2.start();
        t3.start();
        treloj.start();
    }
    
    
}
