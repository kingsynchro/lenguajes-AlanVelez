/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejercicios.Examen;

/**
 *
 * @author T107
 */
public class ProbarTodo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        curso curso1=new curso(); 
               curso1.setNombre("Redes 1"); 
               curso1.setCuatrimestre(2); 
               curso1.setProfesor("Rene"); 
               
                
          curso curso2=new curso(); 
               curso2.setNombre("Java 2"); 
               curso2.setCuatrimestre(4); 
               curso2.setProfesor("Campos");    
                
          curso curso3=new curso(); 
               curso3.setNombre("Sistemas operativos"); 
               curso3.setCuatrimestre(6); 
               curso3.setProfesor("Natisma"); 
               
              curso cursos[]={curso1,curso2,curso3}; 
              
               Alumno a=new Alumno("Juan Carlos",cursos ); 
                
     } 

   
    
}
