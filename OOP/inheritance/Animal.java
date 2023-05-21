package OOP.inheritance;

public class Animal {
    private String name;
    private double weight;
    private String sound;

    public Animal() {
    }

    public Animal(String name, double weight, String sound) {
        this.name = name;
        this.weight = weight;
        this.sound = sound;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", sound=" + sound +
                '}';
    }

    public void move(String speed){
        System.out.println(this.name + " moves " + speed);
    }

    public void makeNoise(){
        System.out.println(this.name + " sound " + this.sound);
    }


}
