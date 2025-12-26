package day01_exercises;

public class Exercicio004 {
    public static void main(String[] args) {
        /*
        🧠 BLOCO 2 — Casting & Inferência
        -----------------------------------------------------
        4️⃣ Simulador de Perda de Dados

        - Leia um valor do tipo double.
        - Converta esse valor para:
          • int
          • long
          • float
        - Exiba todos os valores.
        - Compare os resultados no console.
        */

        double doubleValue = 45.27;

        int intValue = (int) doubleValue;
        long longValue = (long) doubleValue;
        float floatValue = (float) doubleValue;

        System.out.println("Original double : " + doubleValue);
        System.out.println("To int          : " + intValue);
        System.out.println("To long         : " + longValue);
        System.out.println("To float        : " + floatValue);

        System.out.println();
        System.out.println("Comparisons:");
        System.out.println("double == int   : " + (doubleValue == intValue));
        System.out.println("double == long  : " + (doubleValue == longValue));
        System.out.println("double == float : " + (doubleValue == floatValue));
    }
}
