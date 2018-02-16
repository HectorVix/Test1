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
public class ValidarCadena {

    String cad;

    public ValidarCadena(String cadena) {

        this.cad = cadena;
    }

    public boolean balanceada() {
        Pila pila = new Pila();

        for (int i = 0; i < cad.length(); i++) {
            if (cad.charAt(i) == '(' || cad.charAt(i) == '[' || cad.charAt(i) == '{') {
                pila.insertar(cad.charAt(i));
            } else {
                if (cad.charAt(i) == ')') {
                    if (pila.extraer() != '(') 
                        return false;
                    
                } else {
                    if (cad.charAt(i) == ']') {
                        if (pila.extraer() != '[') 
                            return false;
                        
                    } else {
                        if (cad.charAt(i) == '}') {
                            if (pila.extraer() != '{') 
                                return false;                           
                        }
                    }
                }
            }

        }

        if (pila.vacia()) {
            return true;
        } else {
            return false;
        }
    }

    public void mostrar() {
        if (balanceada()) {
            System.out.println("OK");
        } else {
            System.out.println("BAD");
        }
    }

}
