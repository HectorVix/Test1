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

import java.util.ArrayList;
import java.util.List;

public class listaCarros {
    ArrayList<List> listaCar;
    List car;

    public List getCar(int i) {
        
       
          if(i>listaCar.size()){
           System.out.println("Error no existe elemento");
          }
            else
             car=listaCar.get(i);
                        
        
        
        return car;
    }

    public void setCar(List car) {
        this.car = car;
    }
    
 public listaCarros(){
      
    listaCar = new ArrayList<List>();                                                                                                                                               
     
 }
  
 public void addCar(List car){
     listaCar.add(car);
     
 }

    public ArrayList<List> getListaCar() {
        return listaCar;
    }

    public void setListaCar(ArrayList<List> listaCar) {
        this.listaCar = listaCar;
    }
    
    
    
    public void mostrar_Lista_Carros(){
        List car;
        for (int i=0; i<listaCar.size();i++){
             car=listaCar.get(i);
            for(int j=0; j<car.size();j++)
              System.out.print(" "+car.get(j).toString());
            System.out.println("\n");
        }
    }
    
    
    
}
