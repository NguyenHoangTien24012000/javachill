package Abstract;

public class AnimalTest {
    private String name;
    private double weight;

    public AnimalTest(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }
    public void move(String speed){
        System.out.println(name + " move " + speed);
    }
    public void makeNoise(){
        if(weight > 30){
            System.out.println("Wow Wow");
        }else {
            System.out.println("Wao wao");
        }
    }
}
