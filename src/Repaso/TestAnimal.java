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
public class TestAnimal {
    public static void main(String[] args) {
        for(Animal a :GenerarAnimales.generarAnimales()){
            System.out.println(a.getNombre());
        }
    }
    
}
