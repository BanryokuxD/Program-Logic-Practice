/*
 * Escribe una función que reciba dos palabras (String) y retorne
 * verdadero o falso (Bool) según sean o no anagramas.
 * - Un Anagrama consiste en formar una palabra reordenando TODAS
 *   las letras de otra palabra inicial.
 * - NO hace falta comprobar que ambas palabras existan.
 * - Dos palabras exactamente iguales no son anagrama.
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner key = new Scanner(System.in);
        System.out.println("Enter the two words ");
        String wordOne = key.nextLine();
        String wordTwo = key.nextLine();

        isAnagram anagram = new isAnagram();
        boolean solve = anagram.solveAnagram(wordOne, wordTwo);
        
        if (solve) {
            System.out.println("The Words Are Anagrams");
        }else{
            System.out.println("The Words Are Not Anagrams");
        }
        key.close();
    }

}