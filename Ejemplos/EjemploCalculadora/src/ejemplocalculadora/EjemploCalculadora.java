
package ejemplocalculadora;

import java.util.Scanner;

public class EjemploCalculadora {

    public static void main(String[] args) {
        // CALCULADORA
        
        
        //Declaración de variables
        Scanner teclado = new Scanner(System.in);
        double num1, num2, suma;
        
        System.out.println("Ingrese el primer número");
        num1 = teclado.nextDouble();
        
        System.out.println("Ingrese el segundo número");
        num2 = teclado.nextDouble();
        
        suma = num1 / num2;
        
        System.out.println("El resultado es: " +suma);
    }
    
}
