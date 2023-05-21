package OOP.PolymorphismChallenge;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Item coke = new Item("Coke", "drink", 2.5);
        coke.printItem();
        coke.setSize("large");
        coke.printItem();

        Burger burger = new Burger("basic", 5.0);
        burger.addTopping("Bacon", "Cheese", "Mayo");
        burger.printItem();

        LinkedList<String> test = new LinkedList<>(List.of("1", "2", "3", "4", "5"));
        test.push("6");
        System.out.println(test);

    }


}
