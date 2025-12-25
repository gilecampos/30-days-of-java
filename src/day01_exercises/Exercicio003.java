package day01_exercises;

public class Exercicio003 {
    public static void main(String[] args) {
        /*
        -----------------------------------------------------
        3️⃣ Analisador de Overflow

        - Declare uma variável do tipo byte com seu valor máximo.
        - Some 1 a esse valor.
        - Exiba o resultado no console.
        - Explique em comentário o que aconteceu e por quê.
        */

        byte byteValue = 127;
        byteValue++;
        System.out.println(byteValue);


        // 127 em binário: 01111111
        // Após somar 1:  10000000
        // O bit mais significativo indica sinal negativo,
        // fazendo com que o valor seja interpretado como -128.

    }
}
