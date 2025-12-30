package day01_exercises;

public class Exercicio006 {

    public static void main(String[] args) {
         /*
    🧠 BLOCO 3 — Char & Unicode
    -----------------------------------------------------
    6️⃣ Decodificador de Caracteres

    - Leia um único caractere.
    - Exiba:
      • O código Unicode correspondente.
      • O caractere seguinte.
      • O caractere anterior.
    */

        char letter = 'G';

        int unicodeValue = letter;
        char previous = (char) (letter - 1);
        char next = (char) (letter + 1);

        System.out.println("Character       : " + letter);
        System.out.println("Unicode value   : " + unicodeValue);
        System.out.println("Previous char   : " + previous);
        System.out.println("Next char       : " + next);
    }
 }
