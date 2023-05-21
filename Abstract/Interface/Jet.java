package Abstract.Interface;

public class Jet extends Animal implements FlightEnable, Trackable{
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

    @Override
    public FlightStages transition(FlightStages stages) {
        System.out.println("Transitioning + " + getClass().getSimpleName());
        return FlightEnable.super.transition(stages);
    }
}
