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
import java.util.*;

public class Relojito extends Thread{
    public void run(){
        while(true){
        try{
            Calendar Cal=Calendar.getInstance();
            int hora=Cal.get(Calendar.HOUR_OF_DAY);
            int minuto=Cal.get(Calendar.MINUTE);
            int segundo=Cal.get(Calendar.SECOND);
            System.out.println("la hora es:"+hora+":"+minuto+":"+segundo);
            
            
            Thread.sleep(1000);
        }catch(Exception e){}
        
                    }
        
    }
    
}
