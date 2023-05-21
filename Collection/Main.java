package Collection;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Card> deck = Card.getStandardDeck();
        Card.printDeck(deck);

        Card[] cardsArr = new Card[13];
        Card aceOfHearts = Card.getFaceCard(Card.Suit.HEART, 'A');
        Arrays.fill(cardsArr, aceOfHearts);
        Card.printDeck(Arrays.asList(cardsArr), "Aces of Heart", 1);

        List<Card> cardList = new ArrayList<>(52);
        Collections.fill(cardList, aceOfHearts);
        System.out.println(cardList);
        System.out.println(cardList.size());

        Card king = Card.getFaceCard(Card.Suit.CLUB, 'K');
        List<Card> kingsOfClub = Collections.nCopies(13, king);
        Card.printDeck(kingsOfClub, "Kings of club", 1);

        List<Card> cardList1 = Collections.nCopies(13, aceOfHearts);
        Card.printDeck(cardList1, "Item tym", 1);

        Collections.addAll(cardList, cardsArr);
        Collections.addAll(cardList, cardsArr);
        Card.printDeck(cardList, "Card collection aces add: ", 2);

        Collections.copy(cardList, kingsOfClub);
        Card.printDeck(cardList, "Copy item", 2);

        cardList = List.copyOf(kingsOfClub);
        Card.printDeck(cardList1, "Copy of list", 1);

        Card.printDeck(deck);
        Collections.shuffle(deck);
        Card.printDeck(deck, "Shuffle", 4);
        Collections.reverse(deck);
        Card.printDeck(deck, "reverse", 4);

        var sortingAlgorithm = Comparator.comparing(Card::rank).thenComparing(Card::suit);
        Collections.sort(deck, sortingAlgorithm);
        Card.printDeck(deck, "Sorting algorithm", 13);

        Collections.reverse(deck);
        List<Card> kings = new ArrayList<>(deck.subList(4, 8));
        Card.printDeck(kings, "Kings list ", 1);
        List<Card> tens = new ArrayList<>(deck.subList(16, 20));
        Card.printDeck(tens, "Tens list", 1);

        int subListIndex = Collections.indexOfSubList(deck, kings);
        System.out.println("Index sub list " + subListIndex);
        System.out.println("Contain sub list " + deck.containsAll(kings));

        Collections.reverse(deck);
        int subListIndex1 = Collections.indexOfSubList(deck, kings);
        System.out.println("Index sub list " + subListIndex1);
        System.out.println("Contain sub list " + deck.containsAll(kings));

        System.out.println("Common element " + Collections.disjoint(deck, tens));
        System.out.println("Common element " + Collections.disjoint(tens, kings));

        deck.sort(sortingAlgorithm);
        Card tenHeart = Card.getNumbericCard(Card.Suit.HEART, 10);
        int indexTenHeart = Collections.binarySearch(deck, tenHeart, sortingAlgorithm);
        System.out.println("Index ten heart " + indexTenHeart);
        System.out.println("Get index found " + deck.get(indexTenHeart));

        Card tenClub = Card.getNumbericCard(Card.Suit.CLUB, 10);
        Collections.replaceAll(deck, tenClub, tenHeart);
        Card.printDeck(deck.subList(32, 36), "Sub list ten ", 1);

        if (Collections.replaceAll(deck, tenClub, tenHeart)) {
            System.out.println("Replace success");
        }    else {
            System.out.println("Replace error");
        }

        System.out.println("Ten of club card " + Collections.frequency(deck, tenClub));
        System.out.println("Ten of club card " + Collections.frequency(deck, tenHeart));

        System.out.println("Best card: " + Collections.max(deck, sortingAlgorithm));
        System.out.println("Worst card: " + Collections.min(deck, sortingAlgorithm));

        var sortingSuit = Comparator.comparing(Card::suit).thenComparing(Card::rank);
        deck.sort(sortingSuit);
        Card.printDeck(deck, "Sort by suit", 4);
        List<Card> copy = new ArrayList<>(deck.subList(0, 12));
        Collections.rotate(copy, 2);
        System.out.println("UnRotate: " + deck.subList(0,12));
        System.out.println("Rotate 2: " + copy);

        copy = new ArrayList<>(deck.subList(0,12));
        System.out.println("");
        for (int i = 0; i < copy.size()/2; i++){
            Collections.swap(copy, i, copy.size() - 1 - i);
        };
        System.out.println("Revert " + copy);
    }
}
