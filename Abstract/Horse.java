package Abstract;

public class Horse extends Mammal{
    public Horse(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void makeNoise() {

    }

    @Override
    public void sheHair() {
        System.out.println(getExplicitType() + " sheds in the spring");
    }
}
