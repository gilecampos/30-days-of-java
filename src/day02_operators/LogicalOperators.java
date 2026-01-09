package day02_operators;

public class LogicalOperators {
    public static void main(String[] args) {
        int age = 20;
        boolean hasDocument = false;

        boolean canEnter = age >= 18 && hasDocument;
        boolean canTry = age >= 18 || hasDocument;

        System.out.println(canEnter);
        System.out.println(canTry);
    }
}
