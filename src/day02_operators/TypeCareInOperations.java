package day02_operators;

public class TypeCareInOperations {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        double resultWrong = a / b;  // 3.0
        double resultCorrect = (double) a / b; // 3.333...

        System.out.println(resultWrong);
        System.out.println(resultCorrect);
    }
}
