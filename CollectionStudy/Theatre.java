package CollectionStudy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Theatre {
    private final String theatreName;
    private List<Seat> seats = new ArrayList<>();

    public Theatre(String theatreName, int numRows, int seatsPearRow){
        this.theatreName = theatreName;
        int lastRow = 'A' + (numRows - 1);
        for(char row = 'A'; row <= lastRow; row++){
            for(int seatNum = 1; seatNum <= seatsPearRow; seatNum ++){
                Seat seat = new Seat(row + String.format("%02d", seatNum));
                seats.add(seat);
            }
        }
    }

    public String getTheatreName(){
        return  theatreName;
    }

    public boolean reserveSeat(String seatNumber){
        Seat requestedSeat = new Seat(seatNumber);
        int foundSeat = Collections.binarySearch(seats, seatNumber, null);

        if(foundSeat >= 0){
            return seats.get(foundSeat).reserve();
        }else{
            System.out.println("There is no seat " + seatNumber);
            return false;
        }
//        for(Seat seat : seats){
//            System.out.print(".");
//            if(seat.getSeatNumber().equals(seatNumber)){
//                requestedSeat = seat;
//            }
//        }
//        if(requestedSeat == null){
//            System.out.println("There is no seat " + seatNumber);
//            return false;
//        }
//        return requestedSeat.reserve();
    }

    public void getSeats(){
        for(Seat seat : seats){
            System.out.println(seat.getSeatNumber());
        }
    }

    public class Seat implements Comparable<Seat> {
        private final String seatNumber;
        private boolean revered = false;

        public Seat(String seatNumber) {
            this.seatNumber = seatNumber;
        }

        public boolean reserve(){
            if(!this.revered){
                System.out.println("Seat " + seatNumber + " revered");
                this.revered = true;
                return true;
            }
            return false;
        }
        public boolean cancel(){
            if(this.revered){
                this.revered = false;
                System.out.println("Reservation of seat " + seatNumber + " cancelled");
                return true;
            }else {
                return false;
            }
        }
        public String getSeatNumber(){
            return this.seatNumber;
        }

        @Override
        public int compareTo(Seat o) {
            return this.seatNumber.compareToIgnoreCase(o.getSeatNumber());
        }


    }

}
