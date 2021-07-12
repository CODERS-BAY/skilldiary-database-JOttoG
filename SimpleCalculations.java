public class SimpleCalculations {
    public static void main(String[] args) {
        int intNumber1 =2;
        int intNumber2 =4;
        double floatNumber1 = 2.5;
        double floatNumber2 = 4.4;

        System.out.printf(intNumber1+"+"+intNumber2 +"="+ (intNumber1+intNumber2)+"\n");
        System.out.printf(intNumber1+"-"+intNumber2 +"="+ (intNumber1-intNumber2)+"\n");
        System.out.printf(intNumber1+"*"+intNumber2 +"="+ (intNumber1*intNumber2)+"\n");
        System.out.printf(intNumber1+"/"+intNumber2 +"="+ (intNumber1/intNumber2)+"\n");

        System.out.printf("%3.2f + %3.2f = %5.2f \n", floatNumber1, floatNumber2, (floatNumber1+floatNumber2));
        System.out.printf("%3.2f - %3.2f = %5.2f \n", floatNumber1, floatNumber2, (floatNumber1-floatNumber2));
        System.out.printf("%3.2f * %3.2f = %5.2f \n", floatNumber1, floatNumber2, (floatNumber1*floatNumber2));
        System.out.printf("%3.2f / %3.2f = %5.2f \n", floatNumber1, floatNumber2, (floatNumber1/floatNumber2));

    }
}
