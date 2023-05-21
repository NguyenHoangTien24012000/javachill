package Array;

import java.util.Arrays;

public class ArrStep6 {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        System.out.println("Arr " + Arrays.toString(arr));
        System.out.println("Arr length " + arr.length);
        for (int[] item : arr){
            System.out.println("item " + Arrays.toString(item));
        }
        for (int[] item : arr){
            for(int element : item){
                System.out.print("Element:" + element + " ");
            }
            System.out.println(" ");
        }
        System.out.println(Arrays.deepToString(arr));
        arr[0] = new int[]{1,2,3};
        System.out.println(Arrays.deepToString(arr));
        Object[] anyArr = new Object[3];
        anyArr[0] = new String[]{"a", "b", "c"};
        System.out.println(Arrays.deepToString(anyArr));
        anyArr[1] = new int[][]{{2, 1}, {3, 4}};
        System.out.println(Arrays.deepToString(anyArr));
        anyArr[2] = new int[2][2][2];
        System.out.println(Arrays.deepToString(anyArr));
        for(Object element : anyArr){
            System.out.println("Element: " + element.getClass().getSimpleName());
            System.out.println("Element to string " + element);
            System.out.println("Element deep: " + Arrays.deepToString((Object[]) element));
        }
    }
}
