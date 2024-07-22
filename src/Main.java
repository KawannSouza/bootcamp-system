import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Java", "Curso de Java do Santander", 90);
        Curso curso2 = new Curso("JavaScript", "Curso de JavaScript da Alura", 10);

        Mentoria mentoria1 = new Mentoria("Liderança", "Aprendendo a liderar equipes", LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);
    }
}
