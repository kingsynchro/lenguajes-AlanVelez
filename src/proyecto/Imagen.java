/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proyecto;

import java.io.File;
import java.io.Serializable;

/**
 *
 * @author Pam Vengenz
 */
public class Imagen implements Serializable{
    
   private byte[] datosImage;
   private String  nombre;

    public Imagen(byte[] datosImage, String nombre) {
        this.datosImage = datosImage;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public byte[] getDatosImage() {
        return datosImage;
    }

    public void setDatosImage(byte[] datosImage) {
        this.datosImage = datosImage;
    }
    
}
