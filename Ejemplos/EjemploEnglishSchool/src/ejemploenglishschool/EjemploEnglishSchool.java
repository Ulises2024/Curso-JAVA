/*
 Ejercicio: English School 

Un instituto de inglés desea informar a sus alumnos 
los dias y horarios de sus clases. Para ello, decidió la creación de una 
aplicación que, a partir del ingreso de la edad del alumno, le informe en qué 
días y horarios los alumnos tienen clases. Como información, la academia 
proporciona los siguientes datos respecto a los grupos y los diferentes 
horarios: 

- Kinder (de 4 a 6 años inclusive): 
• Lunes y Miércoles de 16 a 17 

- Ist year (de 7 a 8 años inclusive): 
Martes y Jueves de 16:30 a 17:30 

- 2nd year (de 9 a 10 años inclusive): 
Martes y Jueves de 17:30 a 19 

- 3rd year (de II a 13 años inclusive): 
Lunes y Miércoles de 17 a 18:30 


Realizar el programa solicitado por el instituto, donde a partir del ingreso de 
la EDAD del alumno, el sistema informe por pantalla los dias y horarios de 
cursada.
 */
package ejemploenglishschool;

import java.util.Scanner;

public class EjemploEnglishSchool {

    public static void main(String[] args) {
        //Declaracion de variables
        int edad;
        Scanner teclado = new Scanner(System.in);
        System.out.println("***** BIENVENIDO A ENGLISH SCHOOL*****");
        System.out.println("Ingrese la edad del alumno");
        edad = teclado.nextInt();

        if (edad >= 4 && edad <= 6) {
            System.out.println("El horario del grupo KINDER, es Lunes y Miercoles de 16 a 17 horas.");
        } else {
            if (edad >= 7 && edad <= 8) {
                System.out.println("El horario del grupo 1ST YEAR, es Martes y Jueves de 16 a 17:30 horas.");
            } else {
                if (edad >= 9 && edad <= 10) {
                    System.out.println("El horario del grupo 2ND YEAR, es Martes y Jueves de 17:30 a 19 horas.");
                } else {
                    if (edad >= 11 && edad <= 13) {
                        System.out.println("El horario del grupo 3RD YEAR, es Lunes y Miércoles de 17 a 18:30 horas.");
                    } else {
                        System.out.println("Ingresó una edad que no corresconde");
                    }
                }
            }
        }
    }
    
}
