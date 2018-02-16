/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

/**
 *
 * @author Administrador
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
public class scan_Archivo {
  listaCarros lcarros= new listaCarros();

    public listaCarros getLcarros() {
        return lcarros;
    }

    public void setLcarros(listaCarros lcarros) {
        this.lcarros = lcarros;
    }
        
    public  void  leer_archivo (){
      File f = new File("C:/entrada.txt");
      FileReader fr;
      BufferedReader br;
       List<String> car;   
      
      
        try {
            fr= new FileReader(f);
            br= new BufferedReader(fr);
            String linea;
          try {
              while((linea=br.readLine())!=null)
              {
                  car = new ArrayList<String>();
                  StringTokenizer st= new StringTokenizer(linea,",");
                  while(st.hasMoreTokens()){
                   //   System.out.println(st.nextToken());
                   
                    car.add(st.nextToken().toString());
                    
                  }
                   lcarros.addCar(car);
                   
                  
              }
          } catch (IOException ex) {
              Logger.getLogger(scan_Archivo.class.getName()).log(Level.SEVERE, null, ex);
          }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(scan_Archivo.class.getName()).log(Level.SEVERE, null, ex);
        }
      
      
      
        escribirArchivo ea= new escribirArchivo();
        ea.escribir_Archivo();
      
    
}

   
}
