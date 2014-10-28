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
public class Alumno {
    private String nombreAlumno;
    private curso[] cursos;

    public Alumno() {
    }
public Alumno(String nombreAlumno, curso[] cursos) {
        this.nombreAlumno = nombreAlumno;
        this.cursos = cursos;
    }
    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }

    public curso[] getCursos() {
        return cursos;
    }

    public void setCursos(curso[] cursos) {
        this.cursos = cursos;
    }
    
}
