/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrador
 */
public class escribirArchivo {
    
    
    public escribirArchivo(){}
    public void escribir_Archivo(){
    
     FileWriter fw=null;
     PrintWriter pw=null;
     
        try { 
            fw= new FileWriter("C:/prueba1.txt");
            pw= new PrintWriter(fw);
            for(int i=0;i<10;i++)
                pw.write("Linea"+i);
        } catch (IOException ex) {
            Logger.getLogger(escribirArchivo.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
           if(null!=fw)
               try {
                   fw.close();
           } catch (IOException ex) {
               Logger.getLogger(escribirArchivo.class.getName()).log(Level.SEVERE, null, ex);
           }
         }
                
                
                
      
     
        
    }
}
