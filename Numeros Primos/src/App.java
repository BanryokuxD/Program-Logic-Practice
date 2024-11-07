/*
 * Escribe un programa que se encargue de comprobar si un número es o no primo.
 * Hecho esto, imprime los números primos entre 1 y 100.
 */

public class App {
    public static void main(String[] args) throws Exception {
        int limite = 100;

        for (int i = 0; i <= limite; i++) {
            if (isPrimo(i)) {
                System.err.println(i);
            }
        }

    }

    public static boolean isPrimo(int num){
        if (num < 2) {
            return false;
        }
    
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        
        return true;
    }
}
