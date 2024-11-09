
package ejemplooperadorternario;

import java.util.Scanner;


public class EjemploOperadorTernario {

    public static void main(String[] args) {
        /*Programa que dependiendo del promedio de un alumno, nos diga si 
        aprobó o no una materia*/
        
        // Declarar variables
        double promedio;
        String condicionFinal;
        Scanner teclado = new Scanner(System.in);
        //Pedir al usuario que ingrese el promedio por teclado
        System.out.println("Ingrese el promedio del alumno");
        promedio = teclado.nextDouble();
        
        condicionFinal = (promedio >= 4) ? "Aprobado" : "Reprobado";
        
        System.out.println("La condición final del alumno es: "+condicionFinal);
        
        
    }
    
}
