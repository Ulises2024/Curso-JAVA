
package ejemplowhile;

import java.util.Scanner;

public class EjemploWhile {

    public static void main(String[] args) {
        
        //Ejemplo de bucle controlado por contador
            // Declarar variables
            /*
            int contador = 0;

            while(contador<10){
                System.out.println("Estoy en la vuelta número "+contador);
                contador++;
            }
            */
            
            
        //Ejemplo de bucle controlado por centinela
            // Declarar variables
            boolean bandera = true;
            Scanner teclado = new Scanner(System.in);
            String respuesta;
            
            while (bandera == true){
                System.out.println("El valor de mi bandera es: " + bandera);
                System.out.println("¿Estás actualmente motivad@ por el curso de JAVA?" + bandera);
                
                System.out.println("¿Quieres aprender otro lenguaje de programacion?");
                respuesta = teclado.next();
                
                if(respuesta.equals("si")){
                    bandera = false;
                }
            }
           
    }
    
}
