public class Bubblesort {

    public static void main(String[] args) {
        int []array = { 6,4,8,7,3,5,1,2};
        for (int i = 0; i < array.length;i++){
            System.out.print(array[i] + " ; ");
        }
        Sort(array);
        System.out.println("");
        for (int j = 0; j < array.length;j++){

            System.out.print(array[j] + " ; ");
        }
    }
    public static void Sort(int []array){
        int temp;
        for (int i = 0; i<array.length;i++){
            for (int j = 0; j< array.length;j++){
                if (j+1<array.length){
                    if (array[j]>array[j+1]){
                        temp = array[j];
                        array[j] = array[j+1];
                        array[j+1] = temp;
                    }
                }

        }

        }
    }
}
