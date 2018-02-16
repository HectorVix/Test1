/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

/**
 *
 * @author Hector Vix
 */
import java.util.List;
public class ListaC {
    
    Nodo raiz;
    Nodo ultimo;
   public  int tam;

    public int getTam() {
        return tam;
    }
    
    public ListaC(){}
    
  public   void insertar(List car)
    {
     if(raiz==null)
     {
        raiz=new Nodo(car);
        ultimo=raiz; // apunta de nuevo a la raiz y liga el nodo ultimo a ala lista
       // raiz=ultimo;
     
     }
     else
     {
         Nodo nuevo= new Nodo(car);           
            ultimo.siguiente=nuevo;
            nuevo.anterior=ultimo;
            ultimo=nuevo;        
            
//******para volverla doblemente circular para adelante e invertida******
     //     ultimo.siguiente=raiz; //se vuelve circular al  apuntar de nuevo ala raiz , forma normal       
       //     raiz.anterior=ultimo;   // la raiz apunta al nuevo ultimo, forma invertida
         
         
     }
    
     
    }
    
  public   void insertarPos(int pos,List car)
    {   
        calTam();                      
          if(raiz==null)
     {
        raiz=new Nodo(car);
        ultimo=raiz; // apunta de nuevo a la raiz y liga el nodo ultimo a ala lista
        raiz=ultimo;
       
     }
     else
     {
     
//         Al final
   
         if(pos==tam)
         {
         Nodo nuevo= new Nodo(car);           
            ultimo.siguiente=nuevo;
            nuevo.anterior=ultimo;
            ultimo=nuevo;        
            
//******para volverla doblemente circular para adelante e invertida******
       //     ultimo.siguiente=raiz;      
       //     raiz.anterior=ultimo;   
         }

         else {
             // al inicio
              if(pos==0) 
              {
               Nodo nuevo= new Nodo(car);
              
             nuevo.siguiente=raiz;
            raiz.anterior=nuevo;
            raiz=nuevo;
//******para volverla doblemente circular para adelante e invertida******
       //     ultimo.siguiente=raiz;      
       //     raiz.anterior=ultimo;  
            
              
              }
              // en medio
              else
              {
              Nodo nuevo= new Nodo(car);
             Nodo aux=raiz.siguiente;            
             Nodo antes = raiz;
             for(int i=0;i<pos-1;i++)
             {           
                 aux=aux.siguiente;     // para el siguiente tramo de la lista
                 antes=antes.siguiente; // guarda la lista hasta llegar ala posicon
                 
             }
                antes.siguiente=nuevo;
                nuevo.anterior=antes;         
                nuevo.siguiente=aux;
                aux.anterior=nuevo;
           
//******para volverla doblemente circular para adelante e invertida******
       //     ultimo.siguiente=raiz;      
       //     raiz.anterior=ultimo;  
         }
        }
     }
    
    }
       
  public void  extraerPos(int pos)
  {
   calTam();
      if(pos>=0 && pos<=tam)
      {
        if(pos==0)
        {
         raiz=raiz.siguiente;
         raiz.anterior=null;
         
//******para volverla doblemente circular para adelante e invertida******
       //     ultimo.siguiente=raiz;      
       //     raiz.anterior=ultimo; 
        
        }
        else{                    
             Nodo aux=raiz.siguiente;            
             Nodo antes = raiz;
             
             for(int i=0;i<pos-1;i++)                                   
                 antes=antes.siguiente; // guarda la lista hastas llegar ala posicion                            
              for(int i=0;i<pos;i++)                      
              { aux=aux.siguiente;} 
              // para el siguiente tramo de lista                                                      
                 antes.siguiente=aux; // juntando la listas de ambos extremos excluyendo el nodo de la pos
           
           if(pos==tam)  // en caso que el extraido sea el ultimo se actualiza el ultimo           
                  ultimo=ultimo.anterior;            
              else
                  aux.anterior=antes; // el tramo ultimo apunta al antes
            
           
           
//******para volverla doblemente circular para adelante e invertida******
       //     ultimo.siguiente=raiz;      
       //     raiz.anterior=ultimo; 
           
    }   
      }
      else
      {
      
       System.out.println("Es tamaño no existe");
      }
  }
  public void calTam()
  {
      int tam_aux=0;
           Nodo aux=raiz;
         while(aux!=null)
         {
             aux=aux.siguiente;
         tam_aux++;
         }
         
         tam=tam_aux-1;
  
  }
      
     
       public int getValor (int pos)
       {
                int val;
                 
                if(pos==0)
                {
                 return raiz.val;
                }
               else
                {
                Nodo aux=raiz;
                 
                  for(int i=0;i<pos;i++){
                     aux=aux.siguiente;
                  
                  }
                  return aux.val;
                }
                
       }
       
    
  public   void mostrarAdelante(){
     
       if(raiz!=null)
       {
         Nodo aux=raiz;
            
            while(aux!=null)
            {
               List car=aux.car;
        for (int i=0; i<car.size();i++){            
              System.out.print(" "+car.get(i).toString());
                           
            }
            System.out.println("\n");
           aux=aux.siguiente;
       }
     
    
       }
     }
    
    public    void mostrarInvertido(){
     
       if(ultimo!=null)
       {
         Nodo aux=ultimo;
            
            while(aux!=null)
            {
             List car=aux.car;
        for (int i=0; i<car.size();i++){            
              System.out.print(" "+car.get(i).toString());
                           
            }
            System.out.println("\n");
              
              
              aux=aux.anterior;
              
            }
            
           
       
       }
     
     
     }
    
    
}
