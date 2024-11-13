package ejerciciopropuestovectoresdos;

import java.util.Scanner;

public class EjercicioPropuestoVectoresDos {

    public static void main(String[] args) {
        /*2. Realizar un programa que permita la carga de 10 números en un vector. Una vez cargados, se necesita 
        que el programa determine cual es el mayor y cual es el menor de ellos.*/
        
        // Declarar variables
        int numeros[] = new int[10];
        Scanner teclado = new Scanner(System.in);
        
        // Carga el vector
        for( int i=0 ; i<10; i++){
            System.out.println("Ingresa el número que quieres almacenar en la posición " + i);
            numeros[i] = teclado.nextInt();         
        }
        //Buscar el número mayor
        int mayor = Integer.MIN_VALUE;
        for(int i=0; i<10; i++){
            if(numeros[i]>mayor){
                mayor = numeros[i];
            }
        }
        
        //Buscar el número menor
        int menor = Integer.MAX_VALUE;
        for(int i=0; i<10;i++){
            if(numeros[i]<menor){
                menor=numeros[i];
            }
        }
        
        System.out.println("El número mayor es: "+mayor);
        System.out.println("El número menor es: "+menor);
    }
    
}
