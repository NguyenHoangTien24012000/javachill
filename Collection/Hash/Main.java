package Collection.Hash;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String hello1 = "hello";
        String hello2 = "hello";
        String hello3 = "hello";
        String hello4 = "hello";
        String hello5 = "Hello";

        List<String> helloArr = new ArrayList<>(Arrays.asList(hello1, hello2, hello3, hello4, hello5));
        helloArr.forEach(e -> System.out.println(e.hashCode()));
        Set<String> setHello = new HashSet<>(helloArr);
        System.out.println("setHello " + setHello);
        System.out.println("size setHello " + setHello.size());
        for (String setStr : setHello){
            System.out.print(setStr + ": ");
            for (int i = 0; i < helloArr.size(); i++){
                if(setStr == helloArr.get(i)){
                    System.out.print(" " + i + " -- " + helloArr.get(i));
                }
            }
            System.out.println(" ");
        }
    }
}
