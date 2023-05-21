package FPT.STEP1;

import java.util.Scanner;

public class bai1 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        tinhChuVi();
    }
    public static void nhapTenDiem(){
        System.out.println("Ho va ten: ");
        String hoTen = scanner.nextLine();
        System.out.println("Diem trung binh: ");
        double diemTrungBinh = scanner.nextDouble();
        System.out.printf("%s : %.2f diem", hoTen, diemTrungBinh);

    }
    public static void tinhChuVi(){
        System.out.println("Nhap chieu dai va chieu rong cua hinh chu nhat: ");
        double chieu1 = scanner.nextDouble();
        double chieu2 = scanner.nextDouble();
        System.out.println("Dien tich hinh chu nhat: " + (chieu1 * chieu2));
        System.out.println("Chieu rong la: " + Math.min(chieu1, chieu2));
    }
}
