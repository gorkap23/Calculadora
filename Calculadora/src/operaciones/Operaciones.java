package operaciones;

public class Operaciones {
    // Método para sumar dos números enteros
    public int sumar(int valor1, int valor2) {
        int numero;
        numero = valor1 + valor2;
        return numero;
    }

    // Método para restar dos números enteros
    public int restar(int valor1, int valor2) {
        int numero;
        numero = valor1 - valor2;
        return numero;
    }

    // Método para multiplicar dos números enteros
    public int multiplicar(int valor1, int valor2) {
        int numero;
        numero = valor1 * valor2;
        return numero;
    }

    // Método para dividir dos números enteros
    public int dividir(int valor1, int valor2) {
        int numero;
        numero = valor1 / valor2;
        return numero;
    }

    // Método para obtener el resto de la división entre dos números enteros
    public int resto(int valor1, int valor2) {
        int numero;
        numero = valor1 % valor2;
        return numero;
    }
}