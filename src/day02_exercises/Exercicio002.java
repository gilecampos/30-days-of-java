package day02_exercises;

public class Exercicio002 {
    public static void main(String[] args) {
        /*
        📌 Grade System

        Dadas três notas de um aluno:
        - Calcule a média simples
        - Calcule a média ponderada (pesos: 2, 3 e 5)

        Regras:
        - Exiba as duas médias
        - Mostre a diferença entre elas
        - Garanta que o cálculo preserve casas decimais

        Objetivo:
        - Treinar operadores aritméticos
        - Entender impacto do tipo de dado nos cálculos
        */


        var scanner = new java.util.Scanner(System.in);

        System.out.print("Solicite a nota 1(peso 2): ");
        double score1 = scanner.nextDouble();

        System.out.print("Solicite a nota 2(peso 3): ");
        double score2 = scanner.nextDouble();

        System.out.print("Solicite a nota 3(peso 5): ");
        double score3 = scanner.nextDouble();

        double simpleAverage = (score1 + score2 + score3) / 3;
        double weightedAverage = (score1 * 2 + score2 * 3 + score3 * 5) / 10;

        double difference = weightedAverage - simpleAverage;

        System.out.println("Simple average: " + simpleAverage);
        System.out.println("Weighted average: " + weightedAverage);
        System.out.println("Difference: " + difference);
    }
}
