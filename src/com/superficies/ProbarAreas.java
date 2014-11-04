/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.superficies;

/**
 *
 * @author T
 */
public class ProbarAreas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Primero creamo un cuadrado
        try{ 
         Area a=new Area(new Cuadrado(-4)); 
         System.out.println(a.calcular()); 
          
         System.out.println("Si se lanza la excepcion nunca veras esta linea"); 
          }catch(Exception  e){ 
              System.out.println(e.getMessage()); 
          } 

    }
}
