package Array;

import java.util.Arrays;
import java.util.Random;

public class ArrStep4 {
    public static void main(String[] args) {
        int[] firstArr = randomArr(10);
        System.out.println("arr random " + Arrays.toString(firstArr));
        Arrays.sort(firstArr);
        System.out.println("arr sort" + Arrays.toString(firstArr));
        int[] arrRevert = new int[10];
//        int index = 0;
        for (int i = 9; i >=0; i--){
            int index = 9 - i;
            arrRevert[index] = firstArr[i];
        }
        System.out.println("arr revert " + Arrays.toString(arrRevert));
        int[] second = new int[5];
        System.out.println("Second arr" + Arrays.toString(second));
        System.out.println("Second arr" +second);
        System.out.println("-".repeat(30));
        int[] newArr = randomArr(10);
        System.out.println("new arr " + Arrays.toString(newArr));
        int[] arrSort = sortArr(newArr);
        System.out.println("arr sort success" + Arrays.toString(arrSort));
        System.out.println("arr old" + Arrays.toString(newArr));

    }
    public static int[] randomArr(int length){
        int[] newArr = new int[length];
        Random random = new Random();
        for(int i = 0; i < length; i ++){
            newArr[i] = random.nextInt(100);
        }
        return  newArr;
    }
    public static int[] sortArr(int[] arr){
        boolean flag = true;
        while (flag){
            flag = false;
            for (int i = 0; i < arr.length - 1; i++){
                if(arr[i] > arr[i+1]){
                    int item = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = item;
                    flag = true;
                }
            }
        }
        return arr;
    }
}
