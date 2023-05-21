package FPT.STEP1;

import java.util.Arrays;
import java.util.Scanner;

public class bai3 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        challengeArray();
    }
    public static void challengeArray(){
        try {
            System.out.println("Nhap so luong item arr: ");
            int lengthArr = scanner.nextInt();
            int[] myArr = new int[lengthArr];
            for(int i = 0; i < lengthArr; i++){
                System.out.println("Nhap phan tu " + i);
                myArr[i] = scanner.nextInt();
            }
            System.out.println(Arrays.toString(myArr));
            Arrays.sort(myArr);
            System.out.println("Arr duoc sap xep: " + Arrays.toString(myArr));
            System.out.println("Phan tu nho nhat: " + myArr[0]);
        }catch (Exception e){

        }
    }
}
