/*
 Escribir un programa que pida una frase y la muestre toda en mayúsculas
y después toda en minúsculas.
 */
package ej_3;

import java.util.Scanner;

/**
 *
 * @author gonza
 */
public class Ej_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frase = leer.next();
        
        System.out.println(frase.toLowerCase());
        System.out.println(frase.toUpperCase());
        /*String min = frase.toLowerCase();
        String may = frase.toUpperCase();
        */
        
        
        
        
    }
    
}
