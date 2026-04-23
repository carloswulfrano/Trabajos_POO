package FesAragon_POO.Tareas.Tarea9_Ejemplo_Excepciones;

import java.util.Scanner;

public class ErroTexto {
    static void main() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese la cantidad: ");
        String cantidad = entrada.nextLine();

        try {
            //comprueba el primer argumento, una cadena, e intenta
            // devolver un entero de la base especificada

            int numero = Integer.parseInt(cantidad);
            System.out.println("Cantidad convertida: " + cantidad);
        }catch (NumberFormatException e){
            System.out.println("Error: " + e);
            System.out.println("El valor no es una cantidad numerica.");
        }
    }
}
