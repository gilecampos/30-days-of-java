package day02_exercises;

public class Exercicio001 {
    public static void main(String[] args) {
       /*
            📌 Price Calculator

            Você está criando um sistema simples de cálculo de preço final.

            Dados:
            - Preço base do produto (double)
            - Quantidade comprada (int)
            - Taxa de imposto (em %) (15%)
            - Desconto fixo (double) (R$ 10)

            Regras:
            - Calcule o subtotal (preço * quantidade)
            - Aplique o imposto sobre o subtotal
            - Subtraia o desconto
            - Exiba:
              • Subtotal
              • Valor do imposto
              • Preço final

            Restrições:
            - Use operadores aritméticos corretamente
            - Evite erros de divisão inteira
            - Use parênteses para deixar a lógica explícita
        */

        double productPrice = 29.99;
        int quantity = 5;

        double taxRate = 0.15;
        double fixedDiscount = 10.0;

        double subtotal = productPrice * quantity;
        double taxAmount = subtotal * taxRate;
        double finalPrice = subtotal + taxAmount - fixedDiscount;

        System.out.println("Subtotal: R$ " + subtotal);
        System.out.println("Tax: R$ " + taxAmount);
        System.out.println("Final Price: R$ " + finalPrice);
    }
}
