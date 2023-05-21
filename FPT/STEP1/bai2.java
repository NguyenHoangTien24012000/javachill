package FPT.STEP1;

import java.util.Scanner;

public class bai2 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        phuongTrinhBac1();
    }
    public static void phuongTrinhBac1(){
        try {
            System.out.println("Nhap a va b: ");
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            if(a == 0){
                if(b == 0){
                    System.out.println("Phuong trinh vo so nghiem");
                }else {
                    System.out.println("Phuong trinh vo nghiem");
                }
            }else{
                System.out.println("Nghiem cua phuong trinh: " + (-b/a));
            }
        }catch (Exception e){
            System.out.println(e);
        }

    }
}
