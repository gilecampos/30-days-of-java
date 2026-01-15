package day02_exercises;

public class Exercicio003 {
    public static void main(String[] args) {
            /*
            📌 Access Control Engine

            Crie um sistema de liberação de acesso baseado em regras.

            Dados:
            - Idade do usuário
            - Renda mensal
            - Possui antecedentes? (boolean)

            Regras de acesso:
            - Idade mínima: 18
            - Renda mínima: 2500
            - Não pode possuir antecedentes

            Desafio:
            - Determine se o acesso é permitido
            - Use APENAS operadores relacionais e lógicos
            - Não utilize if, else ou switch

            Exiba o resultado final como boolean.
            */

        int age = 18;
        double monthlyIncome = 2500.00;
        boolean hasCriminalRecord = false;
        boolean accessAllowed = age >= 18 && monthlyIncome >= 2500.00 && !hasCriminalRecord;

        System.out.println("Access Allowed: " + accessAllowed);
    }
}
