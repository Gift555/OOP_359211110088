package OOPlab5;

import java.util.Scanner;

public class sortingArray {
    private static final int MAX = 10;
    private static int number[] = new int [MAX];
    public static void main(String[] args) {
        inputData(number,number.length);
        System.out.println("Before sorting: ");
        showData(number,number.length);
        findMaxData(number);
        Sorti
        // findMinData(number);
        // sortingData(number);


    }//main

    private static void sortingData(int[] number) {
    }//sortingData

    private static void FindMinData(int[] number) {
    }//findMinData

    private static void findMaxData(int[] number) {
        int max = number[0];
        for (int i=0;i<number.length;i++){
            if (min<=number[i])
                min = number[i];
        }//for
        System.out.println("The maximum data: " + min);

    }//findMaxData

    private static void showData(int[] number, int length) {
        System.out.print("Data in array: ");
        for (int i=0;i<length;i++){
            System.out.print(number[i]+" ");
        }
        System.out.println();
    }


    private static void inputData(int[] number, int length) {
        //user input data
        Scanner scanner = new Scanner(System.in);
        for (int i=0;i<length;i++)
        {
            System.out.println("Enter an integer["+i+"]: ");
            number[i] = scanner.nextInt();
        }

    }//inputData
}//class

