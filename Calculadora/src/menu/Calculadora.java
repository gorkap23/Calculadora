package menu;
import java.awt.Menu;

import operaciones.Operaciones;

public class Calculadora{
    public static void main(String[] args) {   
        // Variables para almacenar el resultado, la operación y los operandos
        int resultado = 0;
        String operacion = "";
        int[] operandos = new int[2];
        
        // Crear instancias de las clases Menu y Operaciones
        Menu menu = new Menu();
        Operaciones operaciones = new Operaciones();
        
        // Bucle do-while para continuar la ejecución mientras el usuario lo desee
        do {
            // Obtener los operandos desde el menú
            operandos = ((Object) menu).pedirNumeros();
            
            // Obtener la operación desde el menú
            operacion = ((Object) menu).menuOpciones();
            
            // Realizar la operación correspondiente según la opción elegida
            if (operacion.equalsIgnoreCase("+")) {
                resultado = operaciones.sumar(operandos[0], operandos[1]);
                System.out.println("Resultado: " + resultado);
            } else if (operacion.equalsIgnoreCase("-")) {
                resultado = operaciones.restar(operandos[0], operandos[1]);
                System.out.println("Resultado: " + resultado);
            } else if (operacion.equalsIgnoreCase("*")) {
                resultado = operaciones.multiplicar(operandos[0], operandos[1]);
                System.out.println("Resultado: " + resultado);
            } else if (operacion.equalsIgnoreCase("/")) {
                resultado = operaciones.dividir(operandos[0], operandos[1]);
                System.out.println("Resultado: " + resultado);
            } else if (operacion.equalsIgnoreCase("%")) {
                resultado = operaciones.resto(operandos[0], operandos[1]);
                System.out.println("Resultado: " + resultado);
            } else {
                System.out.println("Operación no válida");
            }
        } while (menu.repetir()); // Continuar si el usuario desea repetir
    }
}