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
public class Test1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
      
      
//        Validar Cadena

 ValidarCadena vc=new ValidarCadena("{({})}");
      vc.balanceada();
      vc.mostrar();
      
      
     // leer archivo
     scan_Archivo sa= new scan_Archivo();
     sa.leer_archivo();
    listaCarros lcarros= new listaCarros();
        lcarros=sa.getLcarros();
    // mostrar lista de autos
       // lcarros.mostrar_Lista_Carros();
     
     
    //crear lista circular    
        ListaC l= new ListaC();
       l.insertar(lcarros.getCar(0));
         l.insertar(lcarros.getCar(1));
           l.insertar(lcarros.getCar(2));
             l.insertar(lcarros.getCar(3));
               l.insertar(lcarros.getCar(4));
               
               System.out.println("***Adelante***");
               l.mostrarAdelante();
               System.out.println("***Invertido***");
                l.mostrarInvertido();
                
                System.out.println("***Insertado en la posicion 0 y 2 ***");
                l.insertarPos(0, lcarros.getCar(0));
               l.insertarPos(2, lcarros.getCar(3));
                
                System.out.println("***Adelante***");
               l.mostrarAdelante();
               System.out.println("***Invertido***");
                l.mostrarInvertido();
                
                
               System.out.println("Extraido posicion 2");
               l.extraerPos(2);
               // System.out.println("Extraido ultimo");
             //  l.extraerPos(6);
                System.out.println("***Adelante***");
               l.mostrarAdelante();
               System.out.println("***Invertido***");
                l.mostrarInvertido();
    }
    
}
