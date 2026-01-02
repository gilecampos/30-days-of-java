package day01_exercises;

public class Exercicio007 {
    public static void main(String[] args) {
        /*
        -----------------------------------------------------
        7️⃣ Verificador de Letra

        - Leia um caractere.
        - Determine se ele é:
          • Letra maiúscula
          • Letra minúscula
          • Número
          • Símbolo
        - Não utilize métodos prontos da linguagem para verificação.
        */

        char letter = 'G';

        if (letter >= 'A' && letter <= 'Z') {
            System.out.println("Letra maiúscula");
        } else if (letter >= 'a' && letter <= 'z') {
            System.out.println("Letra minúscula");
        } else if (letter >= '0' && letter <= '9') {
            System.out.println("Número");
        } else {
            System.out.println("Símbolo");
        }
    }
}
