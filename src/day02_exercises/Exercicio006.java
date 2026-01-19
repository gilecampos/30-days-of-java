package day02_exercises;

public class Exercicio006 {
    public static void main(String[] args) {
         /*
        📌 Salary Simulator

        Simule o cálculo de salário líquido.

        Dados:
        - Salário bruto (double)

        Descontos:
        - INSS: 11%
        - Benefícios: 5%

        Regras:
        - Calcule o total de descontos
        - Calcule o salário líquido
        - Determine se o funcionário recebe auxílio
          (salário líquido < 2000)

        Restrição:
        - Não utilize if
        - Use operadores lógicos e relacionais
        */

        final double grossSalary = 3000.00;
        final double INSS_DISCOUNT = 0.11;
        final double BENEFITS_DISCOUNT = 0.05;
        final double TOTAL_DISCOUNT = INSS_DISCOUNT + BENEFITS_DISCOUNT;

        double salaryWithDiscount = grossSalary * (1 - TOTAL_DISCOUNT);
        double totalDiscountedValue = grossSalary * TOTAL_DISCOUNT ;
        boolean receivesAssistance = salaryWithDiscount < 2000;

        System.out.println("salaryWithDiscount: " + salaryWithDiscount);
        System.out.println("discountedValue: " + totalDiscountedValue);
        System.out.println("receivesAssistance: " + receivesAssistance);

    }
}
