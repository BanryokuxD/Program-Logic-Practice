/*
 * Crea un programa que invierta el orden de una cadena de texto
 * sin usar funciones propias del lenguaje que lo hagan de forma automática.
 * - Si le pasamos "Hola mundo" nos retornaría "odnum aloH"
 */

public class App {
    public static void main(String[] args) throws Exception {

        String textoInicial = "Hola Mundo";
        String reverse = "";

        for (int i = textoInicial.length() - 1; i >= 0; i--) {
            reverse += textoInicial.charAt(i);
        }

        System.out.println("Cadena Inicial: " + textoInicial);
        System.out.println("Reverso: " + reverse);

    }
}
