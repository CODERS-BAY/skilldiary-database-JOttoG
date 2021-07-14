import java.util.Scanner;
import java.util.ArrayList;

public class MaximaCalculation {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    ArrayList<Integer> numberArray = new ArrayList<Integer>();
    int biggestNumber = 0;
    System.out.println("Bitte geben Sie die Nummern ein");
    boolean exit = false;

    while(!exit){
        while (input.hasNextInt()){
            numberArray.add(input.nextInt());
        if (input.hasNext("q")){
            exit = true;
        }else if (input.hasNext("Q")){
            exit = true;
        }
        }
        for (int i = 0; i< numberArray.size();i++){
            if (biggestNumber< numberArray.get(i)){
                biggestNumber= numberArray.get(i);
            }
        }


    }
        System.out.print("Number Array:" + numberArray + "\n Biggest number:" + biggestNumber );

    }

}
