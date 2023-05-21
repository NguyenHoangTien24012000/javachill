package ArrayList;

import java.util.Arrays;

public class Example {
    public static void main(String[] args) {
        String[] originalArr = new String[]{"First", "Second", "Third"};
        var originalList = Arrays.asList(originalArr);

        originalList.set(0, "One");
        System.out.println(originalList);;
        System.out.println(Arrays.toString(originalArr));
    }
}
