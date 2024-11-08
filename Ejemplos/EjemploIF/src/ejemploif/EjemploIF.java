
package ejemploif;

import java.util.Scanner;

public class EjemploIF {

    public static void main(String[] args) {
        int edad;
        System.out.println("Ingrese su edad");
        Scanner teclado = new Scanner(System.in);
        
        edad = teclado.nextInt();
        
        if(edad>=18){
            System.out.println("Eres mayor de edad y tienes permitido sufragar. Llegue al final");
        }
        
        System.out.println("Llegue al final.");
    }
    
}
