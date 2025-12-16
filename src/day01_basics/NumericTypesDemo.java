package day01_basics;

public class NumericTypesDemo {
    public static void main(String[] args) {

        int population = 214_000_000;
        long distanceInKm = 9_460_730_472_580L;

        final double PI = 3.14159;
        float rate = 2.5f;

        int binary = 0b1010;       // base 2
        int hexadecimal = 0x1A;    // base 16
        int octal = 0444;          // base 8

        System.out.println("Population: " + population);
        System.out.println("Distance (km): " + distanceInKm);
        System.out.println("PI: " + PI);
        System.out.println("Rate: " + rate);
        System.out.println("Binary (0b1010): " + binary);
        System.out.println("Hexadecimal (0x1A): " + hexadecimal);
        System.out.println("Octal (0444): " + octal);
    }
}
