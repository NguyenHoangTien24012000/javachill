package Array;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] myArrInt = new int[10];
        myArrInt[3] = 20;
        System.out.println("-----" + myArrInt[3] + "--" + myArrInt[5]);
        int myArrInt1[] = new int[]{1,2,3,4,5};
        System.out.println("-----" + myArrInt1[3] + "--" + myArrInt1[4]);
//        --------------
        int[] myArrInt2 = {1, 2, 3, 4, 5};
        int[] myArrInt3;
//        myArrInt3 = {1,2,3,4,5};  invalid
        myArrInt3 = myArrInt2;
        for(int element : myArrInt3){
            System.out.print("------" + element);
        }
        System.out.println("-----" + myArrInt3);
        System.out.println("Arr" + Arrays.toString(myArrInt3));
        Object objNewArray = myArrInt3;
        if(objNewArray instanceof int[]){
            System.out.println("chuan me no luon");
        }
        Object[] objNewArray1 = new Object[3];
        objNewArray1[0] = "Hello";
        objNewArray1[1] = new StringBuilder("test");
        objNewArray1[2] = myArrInt3;
        for(Object element : objNewArray1){
            System.out.println("Obj element :" + element);
        }
    }
}
