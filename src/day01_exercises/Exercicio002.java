package day01_exercises;

public class Exercicio002 {
    public static void main(String[] args) {
        /*
        -----------------------------------------------------
        2️⃣ Conversor Universal

        - Leia um número inteiro.
        - Exiba esse número em:
          • Decimal
          • Binário
          • Hexadecimal
        */

        int value = 249;

        String binary = Integer.toBinaryString(value);
        String hexadecimal = Integer.toHexString(value);

        System.out.println("Decimal     : " + value);
        System.out.println("Binary      : " + binary);
        System.out.println("Hexadecimal : " + hexadecimal.toUpperCase());
    }
}
