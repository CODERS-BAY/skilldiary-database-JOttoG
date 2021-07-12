public class Multiplications {
    public static void main(String[] args) {

        for (int i = 1; i<=10;i++){
            for (int j = 1; j<= 10; j++){
                if (i==1&& j==1){
                    System.out.println("times 1:");
                }else if(i ==2&&j==1){
                    System.out.println("times 2:") ;
                }else if(i==3 && j ==1){
                    System.out.println("times 3:");
                }else if(i==4 && j ==1){
                    System.out.println("times 4:");
                }else if(i==5 && j ==1){
                    System.out.println("times 5:");
                }else if(i==6 && j ==1){
                    System.out.println("times 6:");
                }else if(i==7 && j ==1){
                    System.out.println("times 7:");
                }else if(i==8 && j ==1){
                    System.out.println("times 8:");
                }else if(i==9 && j ==1){
                    System.out.println("times 9:");
                }else if(i==10 && j ==1){
                    System.out.println("times 10:");
                }
                System.out.println(i + " * " + j + " = " + (i*j));

            }
        }
    }
}
