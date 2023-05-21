package Array;

import java.util.Arrays;

public class ArrStep3 {
    public static void main(String[] args) {
        int[] firstArr = new int[]{1,2,3,4,5, 1};
        int index = Arrays.binarySearch(firstArr, 1);
        System.out.println("index search " + index);
        String[] arrString = new String[]{"Test", "tEst", "teSt", "tesT","Test", "TEST"};
//        Arrays.sort(arrString);
        System.out.println("-----" + Arrays.toString(arrString));
        int indexString = Arrays.binarySearch(arrString, "Test");
        System.out.println("index String " + indexString);
        int[] secondArr = new int[]{1,2,3,4};
        int[] thirdArr = new int[]{1,2,3,4,5};
        if(Arrays.equals(secondArr, thirdArr)){
            System.out.println("Equal");
        }else {
            System.out.println("Not equal");
        }
    }
}
