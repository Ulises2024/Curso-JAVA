
package ejemplodowhile;

public class EjemploDoWhile {

    public static void main(String[] args) {
        // Declaración de variables
        
        int contador = 0;
        
        do{
            System.out.println("Estoy en la vuelta número: "+contador);
            contador = contador + 1;
        }while(contador<10);
    }
    
}
