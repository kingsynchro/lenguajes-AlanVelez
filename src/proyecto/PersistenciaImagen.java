/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Synchro
 */
public class PersistenciaImagen {
    public static void guardarImagen(Imagen  i){
          ArrayList<Imagen> imagenes=new ArrayList<Imagen>();
        try{
            File file=new File("archi");
            if(file.exists()){
            imagenes=    leerTodasLasImagenes();
            }
            imagenes.add(i);
            FileOutputStream fos=new FileOutputStream(file);
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(imagenes);
            System.out.println("Guardado cone xito:");
        }catch(Exception e){
            
        }
    }
    
    public static ArrayList<Imagen> leerTodasLasImagenes(){
        ArrayList<Imagen> imagenes=new ArrayList<Imagen>();
      File file=new File("archi");
  
      try{
      FileInputStream fis=new FileInputStream(file);
      ObjectInputStream ois=new ObjectInputStream(fis);
      imagenes=(ArrayList<Imagen>)ois.readObject();
      System.out.println("Leido con exito");
      }catch(Exception e){
          
      }
      return imagenes;
    }
    
    public static Imagen leerImagenPorId(int id){
        Imagen ima=null;
        try{
           ima=  leerTodasLasImagenes().get(id);
        }catch(Exception e){
            
        }
        return ima;
    }
}
