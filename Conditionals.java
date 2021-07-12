import java.util.Scanner;
public class Conditionals {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Bitte geben Sie Ihre Note als eine Ganzzahl an:");
        int grade = in.nextInt();

        switch (grade){
            case 1 -> System.out.println("Sehr gut");
            case 2 -> System.out.println("Gut");
            case 3 -> System.out.println("Befriedigend");
            case 4 -> System.out.println("Genügend");
            case 5 -> System.out.println("Nicht Genügend");
            default -> System.out.println("Die angegebene Zahl befindet sich nicht zwischen 1 und 5");

        }

    }
}
