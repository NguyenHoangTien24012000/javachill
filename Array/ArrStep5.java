package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrStep5 {
    public static void main(String[] args) {
        int[] myArr = createArr();
        System.out.println("MyArr: " + Arrays.toString(myArr));
        System.out.println("Value min of array: " + findMinArr(myArr));
        System.out.println();
    }
    public static int[] createArr(){
        int lengthArr = 0;
        while (true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter length arr type int: ");
            if(scanner.hasNextInt()){
                lengthArr = scanner.nextInt();
                break;
            }else {
                System.out.println("Invalid value!!!");
            }
        }
        int[] newArr = new int[lengthArr];
        for(int i = 0; i < lengthArr; i++){
            while (true){
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter value " + i + ": ");
                if(scanner.hasNextInt()){
                    newArr[i] = scanner.nextInt();
                    break;
                }else {
                    System.out.println("Invalid value!!!");
                }

            }
        }
        return newArr;
    }
    public static int findMinArr(int[] arr){
        int min = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        return min;
    }
}
