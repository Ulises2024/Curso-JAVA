
package ejerciciopropuestovectoresuno;

import java.util.Scanner;

public class EjercicioPropuestoVectoresUno {

    public static void main(String[] args) {
        /*1.Llevar a cabo un programa que incluya un vector que almacene los nombres: Alejandra, Leonardo, 
        Rosa, Guillermo, Gabriel, Daniel, Luisa y Ludmila. Realizar un recorrido del vector para cargar los datos y
        otro recorrido para mostrar los mismos por pantalla.*/
        
        // Declarar variables
        String matriz[][] = new String[8][1];
        Scanner teclado = new Scanner(System.in);
        // Recorrido y carga de matrices
        for (int f = 0; f < matriz.length; f++) { // hacer length a una matriz te devuelve el número de filas
            for (int c = 0; c < matriz[0].length; c++) { // hacer length a una fila te devuelve el número de columnas
                System.out.println("Ingrese el valor para la fila " + f + ", columna " + c + ": ");
                matriz[f][c] = teclado.nextLine();
            }
        }
        // Recorrido y muestra de matrices
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.println("Fila: " + f + " Columna: " + c + " Valor: " + matriz[f][c]);
            }
        }
    }
    
}
