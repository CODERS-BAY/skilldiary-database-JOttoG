import java.util.Scanner;
public class CharacteristicsOfANumber {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int luckyNumber= 7;
        System.out.println("Bitte geben Sie eine beliebige ganze Zahl ein:");
        int input = in.nextInt();
        System.out.printf(luckyNumber + "\n");
        if (input % 10 == 0){
            System.out.printf("Es ist eine runde Zahl!\n");
        }else {
            System.out.printf("Es ist keine runde Zahl!\n");
        }
        if (input % 2 == 0){
            System.out.printf("Es ist eine gerade Zahl!\n");
        } else {
            System.out.printf("Es ist eine ungerade Zahl!\n");
        }
        if (input == luckyNumber){
            System.out.printf("Das ist meine Glückszahl!\n");
        }
        if (input>9){
            System.out.printf("Die Zahl ist zweistellig.\n");
        }

    }
}
