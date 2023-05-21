package Abstract.Interface;

public class Bird extends Animal implements FlightEnable, Trackable{
    @Override
    public void move() {
        System.out.println("Flags wings");
    }

    @Override
    public void takeOff() {
        System.out.println(getClass().getSimpleName() + " take off");
    }

    @Override
    public void land() {
        System.out.println(getClass().getSimpleName() + " land");
    }

    @Override
    public void fly() {
        System.out.println(getClass().getSimpleName() + " fly");
    }

    @Override
    public void track() {
        System.out.println(getClass().getSimpleName() + " track");
    }
}
