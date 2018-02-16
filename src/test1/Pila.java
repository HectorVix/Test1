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
public class Pila {
    
    class Nodo
    {
     char simbolo;
     Nodo siguiente;
     Nodo(char x)
     {
      simbolo=x;
     }
     
    }
    
    Nodo raiz;
    
    Pila()
    {
     raiz=null;
     
    }
    
    public void insertar(char x)
    {  
        Nodo nuevo = new Nodo(x);
        
        if(raiz==null)
        {
        nuevo.siguiente=null;
        raiz=nuevo;
        }
        else{
        
            nuevo.siguiente=raiz;
            raiz=nuevo;
        }
         
    
    }
    
    public char extraer()
    {
    if(raiz!=null)
    {
        char informacion=raiz.simbolo;
        raiz=raiz.siguiente;
        return informacion;
    }
    else
        return Character.MAX_VALUE;
    
                
    }
    
    public boolean vacia(){    
    if(raiz==null)
       return true;
    else
        return false;
    }
    
}
