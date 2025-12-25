package day01_exercises;

public class Exercicio001 {
    public static void main(String[] args) {
        /*
        🧠 BLOCO 1 — Tipos e Representação
        -----------------------------------------------------
        1️⃣ Radar Financeiro

        - Leia um valor monetário do tipo double.
        - Converta esse valor para centavos (int).
        - Gere o valor arredondado.
        - Gere o valor truncado.
        - Exiba todos os valores de forma formatada no console.
        */
        double moneyValue = 4485.90;

        // Conversão para centavos (atenção à precisão do double)
        int centsValue = (int) Math.round(moneyValue * 100);

        // Arredondamento matemático
        int roundedValue = (int) Math.round(moneyValue);

        // Truncamento (descarta casas decimais)
        int truncatedValue = (int) moneyValue;

        System.out.println("Money Value     : " + moneyValue);
        System.out.println("Cents           : " + centsValue);
        System.out.println("Rounded Value   : " + roundedValue);
        System.out.println("Truncated Value : " + truncatedValue);
    }
}
