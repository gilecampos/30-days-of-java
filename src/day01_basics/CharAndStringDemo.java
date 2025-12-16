package day01_basics;

/*
 * Demonstrates how Java handles char and String types,
 * including Unicode values, numeric behavior and String immutability.
 */
public class CharAndStringDemo {
    public static void main(String[] args) {

        // ============================
        // CHAR TYPE
        // ============================

        char letter = 'A';
        char unicodeLetter = '\u0041'; // Unicode for 'A'
        char calculatedChar = 'A' + 2; // 'C'
        char numericChar = 49; // Unicode for '1'

        System.out.println("Char examples:");
        System.out.println("Letter: " + letter);
        System.out.println("Unicode letter: " + unicodeLetter);
        System.out.println("Calculated char ('A' + 2): " + calculatedChar);
        System.out.println("Numeric char (49): " + numericChar);

        // Char as number (implicit casting)
        int charAsNumber = letter;
        System.out.println("Numeric value of 'A': " + charAsNumber);

        // ============================
        // STRING TYPE
        // ============================

        String base = "java";
        String suffix = "backend";

        // Concatenation creates a new String object
        String fullName = base + " " + suffix;

        // Strings are immutable
        String upperCase = fullName.toUpperCase();

        System.out.println("\nString examples:");
        System.out.println("Original string: " + fullName);
        System.out.println("Uppercase string: " + upperCase);
        System.out.println("Original remains unchanged: " + fullName);
    }
}
