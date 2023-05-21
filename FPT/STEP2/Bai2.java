package FPT.STEP2;

import java.util.Scanner;

public class Bai2 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myArr = new int[5];
        for (int i = 0; i <= myArr.length; i++) {
            System.out.println("nhap phan tu arr " + i);
            try {
                myArr[i] = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Say ra loi: " + e);
                break;
            }
        }
    }
}
