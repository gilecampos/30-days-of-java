package day01_basics;

public class CastingDemo {
    public static void main(String[] args) {

        // ============================
        // CASTING IMPLÍCITO (WIDENING)
        // ============================

        int age = 20;
        double ageAsDouble = age; // int -> double (seguro)

        long population = 214_000_000;
        double populationAsDouble = population;

        System.out.println("Implicit casting:");
        System.out.println("Age as int: " + age);
        System.out.println("Age as double: " + ageAsDouble);
        System.out.println("Population as double: " + populationAsDouble);

        // ============================
        // CASTING EXPLÍCITO (NARROWING)
        // ============================

        double salary = 4500.99;
        int salaryAsInt = (int) salary; // perda da parte decimal

        System.out.println("\nExplicit casting:");
        System.out.println("Salary as double: " + salary);
        System.out.println("Salary as int: " + salaryAsInt);

        // ============================
        // OVERFLOW (DADO CORROMPIDO)
        // ============================

        long veryLargeNumber = 3_000_000_000_000L;
        int overflowedValue = (int) veryLargeNumber;

        System.out.println("\nOverflow example:");
        System.out.println("Original long value: " + veryLargeNumber);
        System.out.println("After casting to int: " + overflowedValue);

        // ============================
        // CASTING SEGURO (MESMO TIPO DE RANGE)
        // ============================

        long smallNumber = 10L;
        int safeCast = (int) smallNumber;

        System.out.println("\nSafe explicit casting:");
        System.out.println("Long value: " + smallNumber);
        System.out.println("Int value: " + safeCast);
    }
}
