
package ejemplomatrices;

import java.util.Scanner;

public class EjemploMatrices {

    public static void main(String[] args) {
        // Declarar variables
        int matriz[][] = new int [2][5];
        Scanner teclado = new Scanner(System.in);
        
        //Recorrido y carga de matrices
        for(int f=0; f<matriz.length; f++){ //hacer length a una matriz te devuelve el numero de filas.
            for (int c=0; c<matriz[0].length;c++){ //hacer length a una fila te devuelve el numero de columnas.
                System.out.println("Ingrese el valor para la fila " + f + ", columna " + c + ": ");
                matriz[f][c] = teclado.nextInt();
            }
        }
        
        //Recorrido y muestra de matrices
        for(int f=0; f<matriz.length; f++){
            for (int c=0; c<matriz[0].length;c++){
                System.out.println("Fila: " + f + " Columna: " + c + " Valor: " + matriz[f][c]);

            }
        }
    }
    
}
