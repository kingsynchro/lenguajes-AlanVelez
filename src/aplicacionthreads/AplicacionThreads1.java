/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacionthreads;

/**
 *
 * @author T107
 */
public class AplicacionThreads1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Thread t1=new Thread(new Runnable() {

        @Override
        public void run() {
            while(true){
       try{
           Thread.sleep(6000);
           System.out.println("hola me llamo"+ Thread.currentThread().getName()+" y me dormi 6 segundos");
       
       }catch(Exception e){}
       }
        }//aqui termina el while 
    });//aqui termina el thread
       System.out.println("Este es solo el metodo main");
    t1.start();
    }
    
}
