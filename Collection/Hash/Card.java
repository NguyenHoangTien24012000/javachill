package Collection.Hash;

public class Card {
    private String chat;
    private String so;
    private int soSanh;

    public Card(String chat, String so) {
        this.chat = chat;
        this.so = so;
        this.soSanh = chat == "co" ? 10 : 11 ;
    }

    @Override
    public String toString() {
        return "Card{" +
                "chat='" + chat + '\'' +
                ", so='" + so + '\'' +
                ", soSanh=" + soSanh +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Card card = (Card) o;

        if (!chat.equals(card.chat)) return false;
        return so.equals(card.so);
    }

    @Override
    public int hashCode() {
        int result = chat.hashCode();
        result = 31 * result + so.hashCode();
        return result;
    }
}
