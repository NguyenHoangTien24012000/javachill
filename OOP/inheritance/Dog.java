package OOP.inheritance;

public class Dog extends Animal{
    private String earShape;
    private String tailShape;
    public Dog() {
        super("dog ngu", 30.0, "gao gao");
    }

    public Dog(String name, double weight, String sound){
        this(name, weight, sound, "Ear shape", "Tail Shape");
    }
    public Dog(String name, double weight, String sound ,String earShape, String tailShape){
        super(name, weight, sound);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                '}' + super.toString();
    }

    public void makeSound(){

    }

    @Override
    public void move(String speed) {
        super.move(speed);
        System.out.println("Dog walk and wag");
    }
}
