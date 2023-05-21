package Abstract.Interface;

import java.util.Arrays;

public abstract class Animal {
    public abstract void move();
}

interface FlightEnable{
    double MILES_TO_KM = 1.60934;
    double KM_TO_MILES = 0.621371;
    void takeOff();
    void land();
    void fly();

    default FlightStages transition(FlightStages stages){
//        System.out.println("Transition not implement on " + this.getClass().getName());
//        return null;
        FlightStages nextStage = stages.getNextState();
        System.out.println("Transitioning from " + stages + " to " + nextStage);
        return nextStage;
    };

}

interface Trackable{
    void track();
}

interface OrbitEarth extends FlightEnable{
    void achieveOrbit();

    private static void log(String description){
        var today = new java.util.Date();
        System.out.println(today + ": " + description);
    }
    private void logStage(FlightStages stages, String description){
        description = stages + ": " + description;
        log(description);
    }

    @Override
    default FlightStages transition(FlightStages stages) {
//        return FlightEnable.super.transition(stages);
        FlightStages nextStage = FlightEnable.super.transition(stages);
        logStage(stages, "Beginning transition to " + nextStage);
        return nextStage;
    }
}

enum FlightStages implements Trackable{GROUNDED, LAUNCH, CRUISE, DATA_COLLECTION;

    @Override
    public void track() {
        if(this != GROUNDED){
            System.out.println("Monitoring " + this);
        }
    }

    public FlightStages getNextState(){
        FlightStages[] allStage = values();
        System.out.println("---" + Arrays.toString(allStage));
        return allStage[(ordinal() + 1) % allStage.length];
    }
}

record DragonFly(String name, String type) implements FlightEnable{
    @Override
    public void takeOff() {

    }

    @Override
    public void land() {

    }

    @Override
    public void fly() {

    }
}

class Satellite implements OrbitEarth{
    FlightStages stages = FlightStages.GROUNDED;
    @Override
    public void takeOff() {
//        transition();
    }

    @Override
    public void land() {

    }

    @Override
    public void fly() {

    }

    @Override
    public void achieveOrbit() {

    }
    public void transition(String description){
        System.out.println(description);
        stages = transition(stages);
        stages.track();
    }
}
