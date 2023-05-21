package Abstract.Interface;

public class MainTwo {
    public static void main(String[] args) {
        inFlight(new Jet());
//        FlightStages test = FlightStages.LAUNCH;
//        System.out.println(test.ordinal());
//        System.out.println(test.getNextState());
//        OrbitEarth.log("TEST LOGGING");
        orbit(new Satellite());
        Satellite satellite = new Satellite();
        satellite.transition(FlightStages.GROUNDED);
    }
    private static void inFlight(FlightEnable flier){
        flier.takeOff();
        flier.fly();
        flier.transition(FlightStages.LAUNCH);
        if(flier instanceof Trackable trackable){
            trackable.track();
        }
        flier.land();
    }

    private static void orbit(OrbitEarth orbit){
        orbit.takeOff();
        orbit.fly();
        orbit.land();
    }
}
