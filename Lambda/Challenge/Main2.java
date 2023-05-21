package Lambda.Challenge;

import java.util.Arrays;
import java.util.Random;

public class Main2 {
    public static Random random = new Random();

    public static void main(String[] args) {
        String[] myArr = new String[]{"Tien", "Thuong", "To", "Nhung"};
        Arrays.setAll(myArr, i -> myArr[i].toUpperCase());
        System.out.println(Arrays.toString(myArr));
    }
}
