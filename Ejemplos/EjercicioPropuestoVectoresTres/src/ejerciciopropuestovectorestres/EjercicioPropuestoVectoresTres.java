
package ejerciciopropuestovectorestres;

import java.util.Scanner;


public class EjercicioPropuestoVectoresTres {


    public static void main(String[] args) {
        /*Realizar un programa que permita la carga de 15 números en un vector. Una vez cargados, se necesita que el programa cuente e informe por pantalla cuántas veces se cargó el número 3.*/
        
        // Declarar variables
        int numeros[] = new int[15];
        Scanner teclado = new Scanner(System.in);
        
        // Carga el vector
        for( int i=0 ; i<15; i++){
            System.out.println("Ingresa el número que quieres almacenar en la posición " + i);
            numeros[i] = teclado.nextInt();         
        }
        
        //contar cuantas veces se ingreso el número 3.
        int numcontador=0;
        for(int i=0; i<15;i++){
            if(numeros[i]==3){
                numcontador = numcontador+1;
                
            }
        }
        System.out.println("El número 3 se repite "+numcontador+" veces.");
    }
    
}
