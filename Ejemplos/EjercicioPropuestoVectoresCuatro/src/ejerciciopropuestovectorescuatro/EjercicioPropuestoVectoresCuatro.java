/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciopropuestovectorescuatro;

import java.util.Scanner;

/**
 *
 * @author Ulises
 */
public class EjercicioPropuestoVectoresCuatro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Un empleado desea almacenar en un vector sus 12 sueldos del año. A partir de esto, necesita un 
        programa que determine y muestre por pantalla la suma total de sus 12 sueldos y el promedio de sueldo 
        que tuvo en el año.*/
        
        // Declarar variables
        double sueldos[] = new double[12];
        Scanner teclado = new Scanner(System.in);
        
        // Carga el vector
        for( int i=0 ; i<12; i++){
            System.out.println("Ingresa el número que quieres almacenar en la posición " + (i+1));
            sueldos[i] = teclado.nextDouble();         
        }
        
        //contar cuantas veces se ingreso el número 3.
        double sumasueldo=0;
        for(int i=0; i<sueldos.length;i++){
             sumasueldo = sumasueldo + sueldos[i];
        }
        
        //Promedio de sueldos del año
        double promedio;
        promedio = sumasueldo / sueldos.length;
        
        System.out.println("La suma de los sueldos da como total: "+sumasueldo+" pesos");
        System.out.println("El promedio de sueldo anual es: "+promedio+ "pesos");
    }
    
}
