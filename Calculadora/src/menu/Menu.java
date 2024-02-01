package menu;

import java.util.Scanner;

public class Menu {
    // Objeto Scanner para tomar la entrada del usuario
    private static Scanner teclado = new Scanner(System.in);

    // Método para solicitar al usuario dos números enteros
    public int[] pedirNumeros() {
        // Arreglo para almacenar dos números enteros
        int[] ret = new int[2];
        
        // Solicitar al usuario el primer operando
        System.out.print("Operando 1: ");
        ret[0] = teclado.nextInt();
        
        // Solicitar al usuario el segundo operando
        System.out.print("Operando 2: ");
        ret[1] = teclado.nextInt();
        
        // Devolver el arreglo que contiene los dos números enteros
        return ret;
    }

    // Método para mostrar un menú de operaciones matemáticas y obtener la elección del usuario
    public String menuOpciones() {
        String ret = "";
        
        // Bucle do-while para solicitar al usuario repetidamente hasta que elija una operación válida
        do {
            System.out.print("Operaciones [+,-,*,/,%]: ");
            ret = teclado.next();
        } while (!((ret.equalsIgnoreCase("+")) || (ret.equalsIgnoreCase("-")) ||
                (ret.equalsIgnoreCase("*")) || (ret.equalsIgnoreCase("/")) ||
                (ret.equalsIgnoreCase("%"))
        ));
        
        // Devolver la operación elegida por el usuario
        return ret;
    }

    // Método para preguntar al usuario si desea seguir trabajando con la calculadora
    public boolean repetir() {
        boolean ret = false;
        String respuesta;

        // Bucle do-while para solicitar al usuario repetidamente hasta que dé una respuesta válida
        do {
            System.out.print("¿Desea continuar trabajando con la calculadora? [s/n] ");
            respuesta = teclado.next();
        } while (!((respuesta.equalsIgnoreCase("s")) || (respuesta.equalsIgnoreCase("n"))
        ));
        
        // Si la respuesta es "s", establecer ret en verdadero
        if (respuesta.equalsIgnoreCase("s")){
            ret = true;
        }
        
        // Devolver el valor de ret
        return ret;
    }
}
