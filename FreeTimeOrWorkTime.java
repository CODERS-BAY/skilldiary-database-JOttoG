import java.util.Scanner;
public class FreeTimeOrWorkTime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Bitte geben Sie eine ganze Zahl ein:");
        int givenHour = in.nextInt();

        switch (givenHour){
            case 8,9,10,11-> System.out.println("Worktime");
            case 12 -> System.out.println("Mittag");
            case 13,14,15,16->System.out.println("Worktime");
            default -> System.out.println("Freetime");
        }
    }
}
