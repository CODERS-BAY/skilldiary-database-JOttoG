public class BingoCardGenerator {

    public static void main(String[] args) {

        int columnB[] = new int[5];
        int columnI[] = new int[5];
        int columnN[] = new int[5];
        int columnG[] = new int[5];
        int columnO[] = new int[5];
        String emptyString = "  ";





        for (int i = 0 ; i<=4;i++){
            columnB[i] = generateRandomNumber(1,15);
        for (int j = 0;j<i;j++){
            if(columnB[i] == columnB[j]){
                i--;
                break;
            }
        }
        }
        for (int k = 0 ; k<=4;k++){
            columnI[k] = generateRandomNumber(16,30);
            for (int l = 0; l<k; l++){
                if (columnI[k]==columnI[l]){
                    k--;
                    break;
                }
            }
        }
        for (int m = 0; m<=4;m++){
            columnN[m] = generateRandomNumber(31,45);
            if (m==2){
                columnN[m] = 0;
            }
            for (int n = 0;n<m;n++){
                if (columnN[m]==columnN[n]){
                    n--;
                    break;
                }
            }
        }
        for (int o = 0; o<=4; o++){
            columnG[o] = generateRandomNumber(46 , 60);
            for (int p = 0; p<o;p++){
                if (columnG[o]==columnG[p]){
                    o--;
                    break;
                }
            }
        }
        for (int q = 0; q<=4;q++){
            columnO[q] = generateRandomNumber(61 , 75);
            for (int r = 0; r<q;r++){
                if (columnO[q] == columnO[r]){
                    q--;
                    break;
                }
            }
        }

        int bingoArray[][] = {columnB, columnI, columnN,columnG,columnO};

        System.out.println("BINGO");
        System.out.println("-----------------------------");



        for (int n = 0; n<=bingoArray.length;n++){
            for (int o = 0;o<bingoArray[n].length ;o++){
                System.out.printf("%5d",bingoArray[o][n]);

            }
            System.out.print("\n");
        }


    }


    static int generateRandomNumber(int min, int max){
        int range = max - min +1;
        return (int) ((Math.random()*range) + min);
    }


}
