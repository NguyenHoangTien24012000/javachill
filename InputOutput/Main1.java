package InputOutput;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        System.out.println("Result " + chiaSo());
    }
    public static int chiaSo(){
        int x = getInt();
        int y = getInt();
        return x/y;
    }
    public static int getInt(){
        System.out.println("Nhap so:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
