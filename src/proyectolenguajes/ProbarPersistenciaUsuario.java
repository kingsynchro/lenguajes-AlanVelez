/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectolenguajes;


public class ProbarPersistenciaUsuario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws Exception {
       
        
        Usuario u=new Usuario();
        u.setNombre("panfilo");
        u.setEdad(40);
        u.setSueldo(20000);
        PersistenciaUsuario p=new PersistenciaUsuario();
       p.guardarUsuario(u);
    }
    
}
