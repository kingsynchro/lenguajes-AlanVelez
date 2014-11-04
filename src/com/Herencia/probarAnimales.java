/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Herencia;

/**
 *
 * @author T107
 */
public class probarAnimales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mamifero perro=new Mamifero();
        perro.setNombre("pocke");
        System.out.println("mi perro se llama:" +perro.getNombre());
    }
    
}
