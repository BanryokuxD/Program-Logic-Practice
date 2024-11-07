/*
* Crea un programa que cuente cuantas veces se repite cada palabra
* y que muestre el recuento final de todas ellas.
* - Los signos de puntuación no forman parte de la palabra.
* - Una palabra es la misma aunque aparezca en mayúsculas y minúsculas.
* - No se pueden utilizar funciones propias del lenguaje que
*   lo resuelvan automáticamente.
*/

import java.util.HashMap;
import java.util.Map;

public class App {
    
    public static Map<String, Integer> countWords(String text){
    Map<String, Integer> wordCount = new HashMap<>();
    StringBuilder word = new StringBuilder();
    
    text = text.toLowerCase(); // convertir el texto a minusculas
    
    for (int i = 0; i < text.length(); i++) {
        char currentChar = text.charAt(i);

        //Verificar si es letra o numero
        if (Character.isLetterOrDigit(currentChar)) {
            word.append(currentChar); // construye la palabra caracter por caracter 

        }else if (word.length() > 0) {
            // Si encuentra un espacio o signo de puntuacion y la palabra está completa
            String finalWord = word.toString();
            
            // Añade o actualiza el recuento de la palabra
            if (wordCount.containsKey(finalWord)) {
                wordCount.put(finalWord, wordCount.get(finalWord) + 1);
                
            } else {
                wordCount.put(finalWord, 1);
            }
             // Reinicia el StringBuilder para la siguiente palabra
             word.setLength(0);
        
        } 
    }
    //Agrega la ultima palabra si el texto no termina con un signo de puntuacion
    if (word.length()>0) {
        String finalWord = word.toString();
        wordCount.put(finalWord, wordCount.getOrDefault(finalWord, 0) + 1);

    }
    
    return wordCount;
    }

    public static void main(String[] args) throws Exception {
        String text = "Hola, mundo! Hola, qué tal? Mundo mundo.";

        Map<String, Integer> result = countWords(text);

        //Muestra el recuento final
        for (Map.Entry<String, Integer> entry : result.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
            
        }
    }
}
