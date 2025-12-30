package day01_exercises;

public class Exercicio005 {
    public static void main(String[] args) {
        /*
        -----------------------------------------------------
        5️⃣ Detector de Casting Implícito

        - Declare variáveis na seguinte ordem:
          byte → short → int → long → double
        - Faça as atribuições entre elas.
        - Identifique onde o casting ocorre de forma implícita.
        - Identifique onde seria necessário casting explícito.
        */

        byte byteValue = 10;
        short shortValue = byteValue;
        int intValue = shortValue;
        long longValue = intValue;
        double doubleValue = longValue;

        // Casting implícito
        System.out.println("byteValue: " + byteValue);
        System.out.println("shortValue: " + shortValue);
        System.out.println("intValue: " + intValue);
        System.out.println("longValue: " + longValue);
        System.out.println("doubleValue: " + doubleValue);

        // Casting explícito (narrowing)
        long backToLong = (long) doubleValue;
        int backToInt = (int) longValue;
        short backToShort = (short) intValue;
        byte backToByte = (byte) shortValue;

        System.out.println("\nExplicit casting:");
        System.out.println("backToLong: " + backToLong);
        System.out.println("backToInt: " + backToInt);
        System.out.println("backToShort: " + backToShort);
        System.out.println("backToByte: " + backToByte);

    }
}
