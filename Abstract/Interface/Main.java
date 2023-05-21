package Abstract.Interface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

enum Test{
    ONE,
    TWO,
    THREE
}

public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Animal animal = bird;
        FlightEnable flightEnable = bird;
        Trackable trackable = bird;

//        animal.move();
//        flightEnable.fly();
//        flightEnable.takeOff();
//        flightEnable.land();
//        trackable.track();
        inFlight(flightEnable);
        inFlight(new Jet());
        double kmTravel = 100;
        double milesTravel = kmTravel * FlightEnable.KM_TO_MILES;
        System.out.printf("%.2f KM -> %.2fMM%n", kmTravel, milesTravel);

        ArrayList<FlightEnable> flier = new ArrayList<>();
        flier.add(bird);
        LinkedList<FlightEnable> bestFlier = new LinkedList<>();
        bestFlier.add(bird);

        triggerFliers(flier);
        flyFliers(flier);
        landFliers(flier);

        triggerFliers(bestFlier);
        flyFliers(bestFlier);
        landFliers(bestFlier);

    }

    private static void inFlight(FlightEnable flier){
        flier.takeOff();
        flier.fly();
        if(flier instanceof Trackable trackable){
            trackable.track();
        }
        flier.land();
    }

    private static void triggerFliers(List<FlightEnable> fliers){
        for (var flier : fliers){
            flier.takeOff();
        }
    }
    private static void flyFliers(List<FlightEnable> fliers){
        for (var flier : fliers){
            flier.fly();
        }
    }

    private static void landFliers(List<FlightEnable> fliers){
        for (var flier : fliers){
            flier.land();
        }
    }
}
