package Collection.Hash;

import java.util.*;

public class MainCard {
    public static void main(String[] args) {
        Card card1 = new Card("Co", "2");
        Card card2 = new Card("Co", "2");
        Card card3 = new Card("Tep", "2");

        List<Card> arrCard = new ArrayList<>(Arrays.asList(card1, card2, card3));
        arrCard.forEach(e -> System.out.println(e.hashCode()));
        Set<Card> mySet = new HashSet<>(arrCard);
        System.out.println(mySet);
    }
}
