package day02_exercises;

public class Exercicio008 {
    public static void main(String[] args) {
        /*
        📌 Logical Short-Circuit

        Crie expressões lógicas que envolvam:
        - Comparações numéricas
        - Operadores && e ||

        Objetivo:
        - Demonstrar curto-circuito lógico
        - Criar pelo menos um cenário onde
          uma parte da expressão NÃO é avaliada

        Explique em comentário:
        - Qual parte não foi executada
        - Por quê
        */

        int age = 16;
        boolean hasPermission = false;

        boolean canEnter = (age >= 18) && hasPermission;

        System.out.println("Can enter: " + canEnter);

        /*
        Explicação:

        - A expressão (age >= 18) é avaliada primeiro
        - Como age = 16, o resultado é false
        - Como estamos usando &&, o Java NÃO avalia hasPermission
        - O curto-circuito acontece porque já é impossível
          a expressão inteira ser true
        */
    }
}
