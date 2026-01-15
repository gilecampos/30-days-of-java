package day02_exercises;

public class Exercicio004 {
    public static void main(String[] args) {
        /*
        📌 Expression Engine

        Dadas as variáveis:
        int a = 12;
        int b = 5;
        int c = 3;

        Calcule o resultado da expressão abaixo:
        a + b * c - a / b + (c * (a - b))

        Tarefas:
        - Resolva a expressão manualmente (papel)
        - Implemente no código
        - Compare o resultado esperado com o executado

        Atenção:
        - Observe divisão inteira
        - Observe precedência de operadores
        */

        int a = 12;
        int b = 5;
        int c = 3;

        System.out.println(a + b * c - a / b + (c * (a - b)));

        /*
        Ordem de avaliação:

        1. Parênteses:
           (a - b) = 12 - 5 = 7
           c * 7 = 21

        2. Multiplicações e divisões:
           b * c = 5 * 3 = 15
           a / b = 12 / 5 = 2   // divisão inteira

        3. Soma e subtração:
           12 + 15 - 2 + 21 = 46
        */
    }
}
