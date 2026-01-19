package day02_exercises;

public class Exercicio005 {
    public static void main(String[] args) {
        /*
        📌 Temperature Service

        Crie um serviço de conversão de temperatura.

        Funcionalidades:
        - Converter Celsius para Fahrenheit (celsius * 1,8 + 32)
        - Converter Fahrenheit para Celsius (fahrenheit - 32 * 5 / 9)

        Regras:
        - Use constantes (final)
        - Evite números mágicos
        - Preserve precisão decimal

        Objetivo:
        - Aplicar operadores aritméticos
        - Entender impacto do tipo double vs int
        */

        final double FAHRENHEIT_OFFSET = 32.0;
        final double CELSIUS_TO_FAHRENHEIT_FACTOR = 1.8;
        final double FAHRENHEIT_TO_CELSIUS_FACTOR = 5.0 / 9;

        double fahrenheit = 98.6;
        double celsius = 37;

        double fahrenheitToCelsius =
                (fahrenheit - FAHRENHEIT_OFFSET) * FAHRENHEIT_TO_CELSIUS_FACTOR;
        double celsiusToFahrenheit =
                celsius * CELSIUS_TO_FAHRENHEIT_FACTOR + FAHRENHEIT_OFFSET;

        System.out.println("fahrenheitToCelsius: " + fahrenheitToCelsius);
        System.out.println("celsiusToFahrenheit: " + celsiusToFahrenheit);
    }
}
