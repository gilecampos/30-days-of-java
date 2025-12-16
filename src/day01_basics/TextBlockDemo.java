package day01_basics;

/*
 * Demonstrates the difference between traditional Strings and Text Blocks.
 * Text Blocks improve readability when working with multiline content
 * such as JSON, SQL or HTML.
 */
public class TextBlockDemo {
    public static void main(String[] args) {

        // ============================
        // TRADITIONAL STRING
        // ============================

        String traditionalString =
                "Hello,\n" +
                        "This is a traditional String\n" +
                        "with line breaks\n" +
                        "and concatenation.";

        System.out.println("Traditional String:");
        System.out.println(traditionalString);

        // ============================
        // TEXT BLOCK
        // ============================

        String textBlock = """
                Hello,
                This is a Text Block
                with automatic line breaks
                and preserved formatting.
                """;

        System.out.println("\nText Block:");
        System.out.println(textBlock);

        // ============================
        // REAL BACKEND USE CASE
        // ============================

        String json = """
                {
                  "language": "Java",
                  "focus": "Backend",
                  "day": 1
                }
                """;

        System.out.println("\nJSON example:");
        System.out.println(json);
    }
}
