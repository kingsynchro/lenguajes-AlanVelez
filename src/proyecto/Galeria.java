/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.util.ArrayList;

/**
 *
 * @author T107
 */
public class Galeria {
    ArrayList<Imagensita> imagenes;
    
    public Galeria() {
        imagenes=new ArrayList<Imagensita>();
        
        Imagensita i1=new Imagensita();
        i1.setUrl("/proyecto/a.png");
        i1.setTitulo("league of legends");
        i1.setDescripcion("este es la portada del juego");
        
        Imagensita i2=new Imagensita();
        i2.setUrl("/proyecto/b.png");
        i2.setTitulo("mordekaiser");
        i2.setDescripcion(" un top bien op con el early HD");
        
        Imagensita i3=new Imagensita();
        i3.setUrl("/proyecto/c.png");
        i3.setTitulo("5 vs 5");
        i3.setDescripcion("un team bien balanceado");
        
        Imagensita i4=new Imagensita();
        i4.setUrl("/proyecto/d.png");
        i4.setTitulo("ahri");
        i4.setDescripcion(" un mid que da miedoo :o");
        
        Imagensita i5=new Imagensita();
        i5.setUrl("/proyecto/e.png");
        i5.setTitulo("team skt1");
        i5.setDescripcion(" skin´s de los campeones de LOL");
        
        //agregar estas imagenes al ArrayList
        
        imagenes.add(i1);
        imagenes.add(i2);
        imagenes.add(i3);
        imagenes.add(i4);
        imagenes.add(i5);
        
        
    }

    public ArrayList<Imagensita> leerTodas() {
        return imagenes;
    }

    public void setImagenes(ArrayList<Imagensita> imagenes) {
        this.imagenes = imagenes;
    }
    
}
