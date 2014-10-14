/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.capitulo4.tiposprimitivos;

/**
 *
 * @author T
 */
public class Tipos1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Casting directo
        byte b=2;
        //casting forzado
        byte b2=3;
        int i=2;
        //el siguiente es un casting forzado
        b=(byte)i;
        i=b;
    }
    
}
