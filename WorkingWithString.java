import java.util.Locale;

public class WorkingWithString {
    public static void main(String[] args) {

        String helloWorld = " Hello World! ";

        System.out.printf(helloWorld + helloWorld.length());
        System.out.printf("\n %S", helloWorld);
        System.out.printf("\n %s", helloWorld.toLowerCase(Locale.ROOT));
        System.out.printf("\n %s", helloWorld.replace("World!", "Codersbay!"));
        System.out.printf("\n %s", helloWorld.replace(" Hello World!", "Hello World!"));
        System.out.printf("\n Schleife:\n");
        for (int i = 0; i<=15;i++){
            System.out.printf(i +helloWorld + "\n");
        }
    }
}
