package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

record GroceryItem(String name, String type, int count){
    public GroceryItem(String name){
        this(name, "DAIRY", 1);
    }

//    @Override
//    public String toString() {
//        return String.format("%d %s in %", count, name.toUpperCase(), type);
//    }
}
public class Main {
    public static void main(String[] args) {
        Object[] GroceryArr = new Object[3];
        GroceryArr[0] = new GroceryItem("BimBim");
        GroceryArr[1] = new GroceryItem("DauTay");
        GroceryArr[2] = "TEST";
        System.out.println(Arrays.toString(GroceryArr));

        ArrayList newArrList = new ArrayList<>();
        newArrList.add(new GroceryItem("Xoai"));
        newArrList.add("STRing");

        ArrayList<GroceryItem> test = new ArrayList<>();
        test.add(new GroceryItem("Buffet"));
        test.add(new GroceryItem("Coffee"));
        test.add(0, new GroceryItem("kichi kichi"));
        test.set(0, new GroceryItem("banh my"));
        System.out.println(test);


    }
}
