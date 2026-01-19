package day02_exercises;

public class Exercicio007 {
    public static void main(String[] args) {
         /*
        📌 Increment Trap

        Dado o código abaixo:

        int x = 5;
        int y = x++ + ++x + x;

        Tarefas:
        - Calcule manualmente o valor final de x e y
        - Execute o código
        - Compare os resultados
        - Explique em comentário por que esse tipo de código
          deve ser evitado em projetos reais
        */

        int x = 5;
        int y = x++ + ++x + x;

        System.out.println(x); // valor final 7
        System.out.println(y); // valor final 19

        /*
        Esse tipo de código deve ser evitado porque:
        - A mesma variável é modificada e lida várias vezes na mesma expressão
        - A ordem de avaliação não é óbvia para quem lê
        - Facilita bugs difíceis de identificar
        - Dificulta manutenção e revisão de código

        Em código profissional, incrementos devem ser feitos
        em linhas separadas, de forma explícita.
        */
    }
}
