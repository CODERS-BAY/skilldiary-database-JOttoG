
public class TellMeAboutYourself {
    public static void main(String[] args) {
        String firstName = "Jürgen Otto";
        String lastName = "Gruber";
        int age = 24;
        char gender='m';
        int birthDay[] ={6,11,1996};
        double gradePointAverage=2.3;
        boolean isMarried = false;

        System.out.format("My name is %s %s. \n I am %d years old. \n My gender is %s. \n I was born on %02d %d %d. \n My grade point average was probably %.2f.\n My married status expressed in boolean is: %b", firstName, lastName, age, gender, birthDay[0], birthDay[1], birthDay[2], gradePointAverage, isMarried);
        }
}
