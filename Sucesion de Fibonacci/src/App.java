/*
 * Escribe un programa que imprima los 50 primeros números de la sucesión
 * de Fibonacci empezando en 0.
 * - La serie Fibonacci se compone por una sucesión de números en
 *   la que el siguiente siempre es la suma de los dos anteriores.
 *   0, 1, 1, 2, 3, 5, 8, 13...
 */

public class App {
    public static void main(String[] args) throws Exception {
        // Número de elementos de la sucesión que queremos mostrar
        int n = 50;

        // Variables para los dos primeros númeos de Fibonacci
        long a = 0, b = 1;

        System.out.println("Los primeros " + n + " números de la sucesión de Fibonacci son:");

        for (int i = 0; i < n; i++) {
            System.out.println(a + " "); // Imprimir el número actual

            // Calcular el siguiente número en la secuencia
            long siguiente = a + b;
            a = b; // El segundo número se convierte en el primero
            b = siguiente; // El siguiente número se convierte en el segundo
        }

    }
}
