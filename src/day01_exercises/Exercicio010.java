package day01_exercises;

public class Exercicio010 {
    public static void main(String[] args) {
        /*
        🧠 BLOCO 5 — Entrada de Dados (Scanner)
        -----------------------------------------------------
        🔟 Scanner Bug Hunter

        - Leia um valor inteiro.
        - Em seguida, leia uma String.
        - Corrija o problema clássico envolvendo nextLine().
        - Explique em comentário por que esse problema acontece.
        */


        var scanner = new java.util.Scanner(System.in);

        System.out.print("Solicite um número: ");
        int integerValue = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Solicite uma string: ");
        String text = scanner.nextLine();

        System.out.println(integerValue);
        System.out.println(text);

        // O método nextInt() lê apenas o número digitado,
        // mas não consome o caractere de quebra de linha (\n).
        // Quando nextLine() é chamado em seguida, ele lê esse \n
        // restante do buffer e retorna uma String vazia.
        // Por isso, é necessário chamar nextLine() antes
        // para limpar o buffer de entrada.

    }
}
