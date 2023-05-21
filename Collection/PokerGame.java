package Collection;

import java.util.*;
import java.util.function.Consumer;

public class PokerGame {
    private final List<Card> deck = Card.getStandardDeck();
    private int playerCount;
    private int cardsInHand;
    private List<PokerHand> pokerHands;
    private List<Card> remainingCards;

    public PokerGame(int playerCount, int cardsInHand) {
        this.playerCount = playerCount;
        this.cardsInHand = cardsInHand;
        pokerHands = new ArrayList<>(cardsInHand);
    }

    public void startPlay(){
        Collections.shuffle(deck);
        Card.printDeck(deck);
        int randomRotate = new Random().nextInt(15, 35);
        Collections.rotate(deck, randomRotate);
        Card.printDeck(deck, "Rotate", 1);
        deal();
        System.out.println("-".repeat(40));
        Consumer<PokerHand> checkHand = PokerHand::evalHand;
        pokerHands.forEach(checkHand.andThen(System.out::println));



        int cardsDealt = playerCount * cardsInHand;
        int cardRemaining = deck.size() - cardsDealt;
        remainingCards = new ArrayList<>(Collections.nCopies(cardRemaining, null));
//        Collections.copy(remainingCards, deck.subList(cardsDealt, deck.size()));
        remainingCards.replaceAll(card -> deck.get(cardsDealt + remainingCards.indexOf(card)));
        Card.printDeck(remainingCards, "Remaining card", 4);

    }
    private void deal(){
        Card[][] hands = new Card[playerCount][cardsInHand];
        for(int i = 0, deckIndex = 0; i < cardsInHand; i ++){
            for (int j = 0; j < playerCount; j ++){
                hands[j][i] = deck.get(deckIndex ++);
            }
        }
        int playerNo = 1;
        for (Card[] hand : hands){
            pokerHands.add(new PokerHand(Arrays.asList(hand),playerNo ++));
        }
    }
}
