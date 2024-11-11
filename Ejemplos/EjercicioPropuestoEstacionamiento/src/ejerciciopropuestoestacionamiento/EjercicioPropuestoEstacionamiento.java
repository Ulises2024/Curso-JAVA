
package ejerciciopropuestoestacionamiento;

import java.util.Scanner;

public class EjercicioPropuestoEstacionamiento {

    public static void main(String[] args) {
        /*Ejercicio: Estacionamiento 
        
        Un administrador de un estacionamiento 
        necesita un programa que permita calcular el total a pagar de varios 
        clientes que utilizan el servicio. 
        
        El programa debe solicitar por teclado dos datos: 
            • La patente del vehículo 
            • El tipo de estacionamiento 
        
        Los tipos de estacionamiento disponibles son 3: 
            • Por hora (cuyo valor es de $3 USD por hora) 
            • Media jornada (cuyo valor total es de $15 USD y posee 5% de 
            descuento) 
            • Jornada completa (cuyo valor fijo es de $30 USD y posee 10% de 
            descuento) 
        
        El programa debe calcular el monto a pagar para cada cliente en función
        del tipo de estacionamiento seleccionado. La carga de datos debe 
        continuar hasta que el usuario ingrese la palabra "FIN" en lugar de la 
        patente.
        
        Al finalizar, el programa debe mostrar por pantalla: 
            • La cantidad total de estacionamientos por hora 
            • La cantidad total de estacionamientos de media jornada
            • La cantidad total de estacionamientos de jornada completa 
            • La suma total de ingresos en USD que hubo durante el día.
        */
        
        // Declarar variable por teclado
        Scanner teclado = new Scanner(System.in);
        String patente="";
        int tipoEstacionamiento, cantidadHoras, contador1=0,contador2=0, contador3=0;
        double cobro, recaudadoDia=0;
        
        /*El programa debe solicitar por teclado dos datos: 
            • La patente del vehículo 
            • El tipo de estacionamiento */
   
        
        while(!patente.equalsIgnoreCase("fin")){
            System.out.println("Ingrese la patente de su vehiculo");
            patente = teclado.nextLine();
            
            if(!patente.equalsIgnoreCase("fin")){
                
           
            
            System.out.println("Ingrese el tipo de servicio");
            System.out.println("1.- Por Hora");
            System.out.println("2.- Media jornada (5 horas)");
            System.out.println("3.- Jornada completa (Hasta 10 horas)");
            
            //reiniciar scanner
            teclado = new Scanner(System.in);
            tipoEstacionamiento=teclado.nextInt();
            
                if(tipoEstacionamiento <=0 || tipoEstacionamiento >3 ){
                    System.out.println("No ingresó un tipo de servicio correcto");
                }else{
                    /*Los tipos de estacionamiento disponibles son 3: 
                    • Por hora (cuyo valor es de $3 USD por hora) 
                    • Media jornada (cuyo valor total es de $15 USD y posee 5% de 
                    descuento) 
                    • Jornada completa (cuyo valor fijo es de $30 USD y posee 10% de 
                    descuento) */

                    if(tipoEstacionamiento == 1){
                        System.out.println("Ingrese la cantidad de horas que desea estacionar");
                        cantidadHoras = teclado.nextInt();
                        cobro=cantidadHoras*3;
                        System.out.println("El costo de su servicio es: "+cobro);
                        contador1++;
                        recaudadoDia = recaudadoDia + cobro;
                    }else{
                        if(tipoEstacionamiento == 2){
                            System.out.println("El servicio de media jornada corresponde a 5 horas y posee un descuento del 5%.");
                            cobro=15-(15*0.05);
                            System.out.println("El costo de su servicio es: "+cobro);
                            contador2++;
                            recaudadoDia = recaudadoDia + cobro;
                        }else{
                            if( tipoEstacionamiento == 3){
                                System.out.println("El servicio de jornada completa corresponde a 10 horas y posee un descuento del 10%.");
                                cobro=30-(30*0.10);
                                System.out.println("El costo de su servicio es: "+cobro);
                                contador3++;
                                recaudadoDia = recaudadoDia + cobro;
                            }
                        }
                    }
                    System.out.println("********** MUCHAS GRACIAS POR PREFERIRNOS **********\n");
                }
                teclado = new Scanner(System.in);
            }
        }
        
        System.out.println("============================================================================");
        System.out.println("=====                 Cobros totales del día                           =====");
        System.out.println("=====                 **********************                           =====");
        System.out.println("=====                                                                  =====");
        System.out.println("=====      Cantidad de servicios por hora: "+contador1+"                      =====");
        System.out.println("=====      Cantidad de servicios Media jornada: "+contador2+"                 =====");
        System.out.println("=====      Cantidad de servicios jornada completa: "+contador3+"              =====");
        System.out.println("=====      El monto total recaudado del día es de: $"+recaudadoDia+"USD       =====");
        System.out.println("=====                                                                  =====");
        System.out.println("=====                                                                  =====");
        System.out.println("============================================================================");
    }
    
}
