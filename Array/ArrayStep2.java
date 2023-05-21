package Array;

import java.util.Arrays;
import java.util.Random;

public class ArrayStep2 {
    public static void main(String[] args) {
        int[] firstArr = getRandomArray(10);
        System.out.println("First arr " + Arrays.toString(firstArr));
        Arrays.sort(firstArr);
        System.out.println("First sort" + Arrays.toString(firstArr));
        int[] secondArr = new int[10];
        System.out.println("Second arr" + Arrays.toString(secondArr));
        Arrays.fill(secondArr, 5);
        System.out.println("Fill second arr" + Arrays.toString(secondArr));
        int[] thirdArr = getRandomArray(8);
        System.out.println("Third arr " + Arrays.toString(thirdArr));
        int[] fourArr = Arrays.copyOf(thirdArr, 8);
        int[] fiveArr = Arrays.copyOf(thirdArr, 4);
        int[] sixArr = Arrays.copyOf(thirdArr, 10);
        System.out.println("Third Arr" + Arrays.toString(thirdArr) + "\n"
                        + "Four arr" + Arrays.toString(fourArr) + "\n"
                        + "Five arr" + Arrays.toString(fiveArr) + "\n"
                        + "Six arr" + Arrays.toString(sixArr));
     }
    public static int[] getRandomArray(int len){
        Random random = new Random();
        int[] newArr = new int[len];
        for (int i = 0; i < len; i++) {
            newArr[i] = random.nextInt(100);
        }
        return newArr;
    }
}
