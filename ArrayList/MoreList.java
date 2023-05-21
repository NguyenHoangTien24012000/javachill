package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MoreList {
    public static void main(String[] args) {
        String[] items = {"1", "2", "3", "4"};

        List<String> list = List.of(items);
        System.out.println(list);
//        List.add("TEST");
        ArrayList<String> newList = new ArrayList<>(list);
        newList.add("5");
        newList.add(0, "0");
        System.out.println((newList));
        ArrayList<String> nextList = new ArrayList<>(List.of("6", "7", "8"));
        System.out.println(nextList);
        newList.addAll(nextList);
        System.out.println(newList);

        System.out.println("Value index stt 2: " + newList.get(1));
        if(newList.contains("5")){
            System.out.println("NewList contains 5");
        }
        newList.add("2");
        System.out.println(newList);
        System.out.println("First index of: " + newList.indexOf("2"));
        System.out.println("Last index of: " + newList.lastIndexOf("2"));
        newList.remove("2");
        newList.remove(8);
        System.out.println(newList);
        newList.addAll(List.of("1", "9", "10"));
        System.out.println(newList);
        newList.removeAll(List.of("1", "9"));
        System.out.println(newList);
        newList.retainAll(List.of("0", "4", "6", "7", "10"));
        System.out.println(newList);
        newList.clear();
        System.out.println(newList );
        System.out.println("newList empty: " + newList.isEmpty());

        newList.addAll(List.of("1", "5", "2", "4", "3"));
        newList.addAll(Arrays.asList("7", "8", "6"));
        System.out.println(newList);
        newList.sort(Comparator.naturalOrder());
        System.out.println(newList);
        newList.sort(Comparator.reverseOrder());
        System.out.println(newList);
        var translateArr = newList.toArray(new String[newList.size()]);
        System.out.println(translateArr);
        System.out.println(Arrays.toString(translateArr));

    }

}
