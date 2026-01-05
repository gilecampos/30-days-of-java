package day01_exercises;

public class Exercicio009 {
    public static void main(String[] args) {
        /*
        -----------------------------------------------------
        9️⃣ Analisador de String

        - Leia uma frase.
        - Conte a quantidade total de caracteres.
        - Conte a quantidade de espaços.
        - Exiba o primeiro e o último caractere da frase.
        */

        String phrase = "O senhor é meu pastor, e nada me faltará";
        int countCharacter = phrase.length();
        char firstLetterOfPhrase = phrase.charAt(0);
        char lastLetterOfPhrase = phrase.charAt(phrase.length() - 1);
        int blankSpaceCount = 0;


        for (int i = 0; i < phrase.length(); i++) {
            if(phrase.charAt(i) == ' ') {
                blankSpaceCount++;
            }
        }


        System.out.println("phrase              : " + phrase);
        System.out.println("countCharacter      : " + countCharacter);
        System.out.println("firstLetterOfPhrase : " + firstLetterOfPhrase);
        System.out.println("lastLetterOfPhrase  : " + lastLetterOfPhrase);
    }
}
