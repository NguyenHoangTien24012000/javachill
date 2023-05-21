package Boxing;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Code old
        Integer boxInt = Integer.valueOf(15);
        Integer boxInt1 = new Integer(15);
        int unboxInt = boxInt.intValue();

        //Auto Box
        Integer autoBox = 15;
        int unboxAuto = autoBox;
        System.out.println(autoBox.getClass().getSimpleName());

        var newList = createArr(1,2,4,5);
        System.out.println(newList);

    }

    public static ArrayList<Integer> createArr(int... varargs){
        ArrayList<Integer> myArrList = new ArrayList<>();
        for(int item: varargs){
            myArrList.add(item);
        }
        return myArrList;
    }
}
