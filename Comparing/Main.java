package Comparing;

import java.util.Arrays;

public class Main {
//    publ class compare

    public static void main(String[] args) {
        Integer five = 5;
        Integer[] others = new Integer[]{0, 1, 2, 3, 6, 7, 8};
        for (Integer ele : others){
            int val = five.compareTo(ele);
            System.out.printf("%d %s %d: compareTo = %d%n", five, (val == 0 ? "==" : (val < 0) ? "<" : ">"), ele, val);
        }
        String banana = "banana";
        String[] fruits = {"apple", "banana", "orange", "BANANA"};
        for (String ele : fruits){
            int val = banana.compareTo(ele);
            System.out.printf("%s %s %s: compareTo = %d%n", banana, (val == 0 ? "==" : (val < 0) ? "<" : ">"), ele, val );
        }
        Arrays.sort(fruits);
        Student[] students = {new Student("c"), new Student("b"), new Student("a")};
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));
//        for (Student ele : students){
//
//        }
    }
}
