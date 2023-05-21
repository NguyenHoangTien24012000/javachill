package Abstract;

public class Fish extends Animal{

    public Fish(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        if(speed.equalsIgnoreCase("slow")){
            System.out.println(getExplicitType() + "Swimming slow");
        }else {
            System.out.println(getExplicitType() + "Swimming quickly");
        }
    }

    @Override
    public void makeNoise() {
        if(type.equalsIgnoreCase("FishGold")){
            System.out.println(getExplicitType() + "Si Si");
        }else {
            System.out.println(getExplicitType() + "Vu Vu");
        }
    }
}
