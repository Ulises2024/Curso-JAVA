
package ejerciciopropuestotres;



public class EjercicioPropuestoTres {


    public static void main(String[] args) {
        /*3. Realizar un programa que muestre por pantalla los números del 
        200 al 250 saltando de 2 en dos. La secuencia debería ser: 200...202...
        204...etc.*/
        
        // Declarar variable por teclado
        int limite = 250;

        // Bucle for para contar vueltas
        for (int contador = 200; contador <= limite; contador += 2) {
            System.out.println("Estoy en la vuelta número: " + contador);
        }
    }
    
}
