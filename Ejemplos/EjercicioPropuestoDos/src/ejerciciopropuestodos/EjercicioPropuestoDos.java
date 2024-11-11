
package ejerciciopropuestodos;

import java.util.Scanner;

public class EjercicioPropuestoDos {

    public static void main(String[] args) {
        /*Realizar un programa que dado por teclado un límite numérico 
        (por ejemplo 100) muestre en pantalla todos los números hasta ese 
        límite (empezando por 1).*/
        
        // Declarar variable por teclado
        Scanner teclado = new Scanner(System.in);
        int limite = 0;
        boolean entradaValida = false;

        // Solicitar el número de vueltas y validar la entrada
        while (!entradaValida) {
            System.out.println("Ingrese el número límite de vueltas (solo números):");
            if (teclado.hasNextInt()) {
                limite = teclado.nextInt();
                entradaValida = true; // La entrada es válida, salimos del bucle
            } else {
                System.out.println("Entrada no válida. Por favor, ingrese un número entero.");
                teclado.next(); // Limpiar la entrada no válida
            }
        }

        // Bucle for para contar vueltas
        for (int contador = 1; contador <= limite; contador++) {
            System.out.println("Estoy en la vuelta número: " + contador);
        }


    }
    
}
