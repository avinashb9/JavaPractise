package algorithms;

public class SelectionSort {

    public static void main(String[] args) {
        int[] numbers = {23, 12, 34, 56, 34};
        System.out.println("Before Sorting:");
        printArray(numbers);
//        selectionSort(numbers);
        bubbleSort(numbers);
        System.out.println();
        System.out.println("After Sorting:");
        printArray(numbers);
    }

    public static void printArray(int[] numbers){
        for (int i : numbers) {
            System.out.print(i + ", ");
        }
    }

    public static void selectionSort(int[] numbers){
        //selection sort technique
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length ; j++) {

                if (numbers[i] > numbers[j]) {
                    //swap
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
    }

    public static void bubbleSort(int[] numbers){
        for(int i=0;i<numbers.length;i++){
            for(int j=0;j<numbers.length-i-1;j++){
                if(numbers[j] > numbers[j+1]){
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }
        }
    }
}
