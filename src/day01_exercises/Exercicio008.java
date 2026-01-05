package day01_exercises;

public class Exercicio008 {
    public static void main(String[] args) {
        /*
        🧠 BLOCO 4 — Strings & Text Blocks
        -----------------------------------------------------
        8️⃣ Gerador de Perfil

        - Leia:
          • Nome
          • Idade
          • Cidade
        - Gere um perfil formatado utilizando Text Block.
        - Exiba o perfil no console.
        */

        String name = "Gileandro Moraes de Campos";
        int age = 22;
        String city = "São Paulo";

        String profile = """
            ------------------------------------
            USER PROFILE
            ------------------------------------
            Name: %s
            Age : %d
            City: %s
            ------------------------------------
        """.formatted(name, age, city);

        System.out.println(profile);
    }
}
