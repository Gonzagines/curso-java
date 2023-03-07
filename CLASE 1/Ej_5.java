/*
 Escribir un programa que lea un número entero por teclado
y muestre por pantalla el doble, el triple y la raíz cuadrada de ese número. 
 */
package ej_5;

import java.util.Scanner;

/**
 *
 * @author gonza
 */
public class Ej_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero entero");
        Double num = leer.nextDouble();
        System.out.println("El doble del numero es " + num*2);
        System.out.println("El triple del numero es " + num*3);
        System.out.println("La raíz cuadrada del numero es " + Math.sqrt(num));
    }
    
}
