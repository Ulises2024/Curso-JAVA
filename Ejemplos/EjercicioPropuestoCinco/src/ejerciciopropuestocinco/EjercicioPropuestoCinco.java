
package ejerciciopropuestocinco;

import java.util.Scanner;

public class EjercicioPropuestoCinco {

    public static void main(String[] args) {
        /*5. Realizar un programa que muestre en pantalla palabras que 
        sean ingresadas por teclado hasta que se ingrese la palabra "salir".*/
        
        //Declarar variables
        
        String palabra;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese la palabra que quiera mostrar por teclado");
        palabra = teclado.nextLine();
        
        while(!palabra.equalsIgnoreCase("salir")){
            System.out.println("La palabra es: "+palabra);
            
            System.out.println("Ingrese otra palabra");
            palabra = teclado.nextLine();
            
        }
        System.out.println("Haz salido del programa! Bye");
        
    }
    
}
