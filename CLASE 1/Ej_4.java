/*
 Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit.
La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package ej_4;

import java.util.Scanner;

/**
 *
 * @author gonza
 */
public class Ej_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese los grados centígrados");
        double grados = leer.nextDouble();
        double far = 32 + (9*grados/5);
        System.out.println(far);
    }
    
}
