package Generic.Challenge;

public class Main {
    public static void main(String[] args) {
        var nationUSPark = new Park[]{
                new Park("Park1", "100, 101"),
                new Park("Park2", "102, 103"),
                new Park("Park3", "104, 105")
        };
        Layer<Park> parkLayer = new Layer<>(nationUSPark);
        parkLayer.renderLayer();
    }
}
