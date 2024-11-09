/*
 Ejercicio: Mercería 

Una mercería vende canutillos y mostacillas al por mayor mediante su página web. 
Como se trata de una mercería mayorista, solicita la cantidad de paquetes en 
cada venta y dependiendo de esta realiza los siguientes controles: 

• Si la cantidad de productos es menor a 5: Se debe emitir un mensaje indicando 
que no se permiten compras inferiores a 5 productos. 

• Si la cantidad de productos es mayor o igual a 5 pero menor o igual a 15: Se 
debe emitir un mensaje que el costo de envio es de $10 USD. 

• Si la cantidad de productos es mayor a 15: Se debe emitir un mensaje de que 
el envío es gratuito. 


Realizar el programa necesario para llevar a cabo los 3 controles citados.
 */


/*
Punto Extra 

Solicitar, además de la cantidad de paquetes, el costo total que suma la compra 
en USD. Y aplicar las siguientes promociones: 

• Si el monto total es inferior a 100 USD: No hay promociones. Informar cuantos 
$USD más necesita para poder entrar a una promoción. 

• Si el monto supera los 100 USD pero es menor a los 300: Informar que posee un 
un descuento del 5% sobre el total. Especificar cuánto sería el nuevo monto 
total con descuento. 

• Si el monto supera los 300 USD: Informar que posee un descuento del 10%. 
Especificar cuánto sería el nuevo monto total con descuento.


*/
package ejemplomerceria;

import java.util.Scanner;

public class EjemploMerceria {

    public static void main(String[] args) {
        // Declaracion de variables
        int cantidadProductos;
        double montoTotal, diferencia, descuento, totalConDescuento;

        Scanner teclado = new Scanner(System.in);

        //Preguntar por teclado cuantos productos son:
        System.out.println("Ingrese la cantidad de productos");
        cantidadProductos = teclado.nextInt();

        //Evaluar los casos posibles
        if (cantidadProductos < 5) {
            System.out.println("No se permiten ventas minoristas(Cantidad de productos minima 5)");
        } else {
            
            System.out.println("Ingrese el monto total de la compra");
            teclado = new Scanner(System.in);
            montoTotal=teclado.nextDouble();
            
            if (cantidadProductos >= 5 && cantidadProductos <= 15) {
                System.out.println("El costo del envio es de 10 USD");
                montoTotal = montoTotal + 10;
            } else {
                System.out.println("No tiene costo de envio.¡Muchas gracias por su compra!");
            }

            if (montoTotal < 100) {
                diferencia = 100 - montoTotal;
                System.out.println("El monto es menor a 100 por lo que no posee promociones.");
                System.out.println("Necesita comprar: " + diferencia + "USD para entrar en promo.");
            } else {
                if (montoTotal >= 100 && montoTotal <= 300) {
                    descuento = montoTotal * 0.05;
                    totalConDescuento = montoTotal - descuento;
                    System.out.println("Por su compra tiene un descuento del 5% que equivale a " + descuento + ". El monto total con descuento es de: " + totalConDescuento);
                } else {
                    descuento = montoTotal * 0.10;
                    totalConDescuento = montoTotal - descuento;
                    System.out.println("Por su compra tiene un descuento del 10% que equivale a " + descuento + ". El monto total con descuento es de: " + totalConDescuento);
                }

            }
        }
    }
    
}
