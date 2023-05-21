package Abstract;

public class DogTest extends AnimalTest{
    public DogTest(String name, double weight) {
        super(name, weight);
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        System.out.println("Dog move");
    }

    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.println("Dog Wowwww");
    }
}
