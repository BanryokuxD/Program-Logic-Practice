/*
 * Crea un programa se encargue de transformar un número
 * decimal a binario sin utilizar funciones propias del lenguaje que lo hagan directamente.
 */

import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);  
        System.out.println("Digite el numero a convertir");
        int numero = teclado.nextInt();

        Convertidor convertir = new Convertidor(numero);
        String binario = convertir.convertirABinario();

        System.out.println("El numero binario es : " + binario);
        System.out.println("El numero digitado es : " + numero);

        teclado.close();
    }
}
