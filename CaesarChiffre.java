import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CaesarChiffre {
    public static void main(String[] args) throws IOException {
        Scanner inputOffset = new Scanner(System.in);
        System.out.println("Bitte geben Sie den Offset als Ganze Zahl(Bsp.:+3/-3, etc.) ein");
        int offset = inputOffset.nextInt();
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Bitte geben Sie den zu verschlüsselnden Text ein:");
        String temporary = br.readLine();

        int stringLength = temporary.length();

        int overflow;
        char characterArray[] = new char[stringLength];
        //filling character array with user input
        for (int i = 0; i < characterArray.length; i++) {
            characterArray[i] = temporary.charAt(i);
        }
        //adding offset to individual characters and outputting them
        for (int j = 0 ; j<characterArray.length;j++){
            if(characterArray[j]>=65 && characterArray[j]<=90){//check if lower case Char
                if (characterArray[j] + offset >90){
                    overflow = (characterArray[j] + offset) - 90;
                    characterArray[j] = (char) (64 + overflow);
                    System.out.print(characterArray[j]);
                }else if (characterArray[j] + offset<65){
                    overflow = (characterArray[j]  + offset) -65;
                    characterArray[j] = (char) (91 + overflow);
                    System.out.print(characterArray[j]);
                }else{
                    characterArray[j] = (char) (characterArray[j] + offset);
                    System.out.print(characterArray[j]);
                }
            }else if(characterArray[j]>=97 && characterArray[j]<=122){//check if upper case char
                if(characterArray[j]+offset > 122){
                    overflow = (characterArray[j] + offset) - 122;
                    characterArray[j] = (char) (96 + overflow);
                    System.out.print(characterArray[j]);
                }else if(characterArray[j] + offset <97){
                    overflow = characterArray[j] + offset - 97;
                    characterArray[j] = (char)  (123 + overflow);
                    System.out.print(characterArray[j]);
                }else{
                    characterArray[j] = (char) (characterArray[j] + offset);
                    System.out.print(characterArray[j]);
                }
            }else{//if character is not in the charset just return the character
                System.out.print(characterArray[j]);
            }


        }

    }
}
