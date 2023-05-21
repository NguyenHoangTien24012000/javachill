package InterviewAlgothim;

import java.util.Arrays;

public class AddTwoNumbers {
    public static void main(String[] args) {
        int[] test = new int[]{1,3,2,7,9};
        int[] test1 = addNumberTarget(test, 11);
        System.out.println(Arrays.toString(test1));
    }
    public static int[] addNumberTarget(int[] arrays, int target){
        int[] result = new int[2];
        boolean check = false;
        for (int i = 0; i < arrays.length - 1; i++) {
            if (check){
                break;
            }
            int tam = target - arrays[i];
            for (int j = i + 1; j < arrays.length; j++) {
                if(tam == arrays[j]){
                    result[0] = i;
                    result[1] = j;
                    check = true;
                    break;
                }
            }
        }
        return result;
    }
}

