package CollectionStudy;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Theatre theatre = new Theatre("TEST Thoi", 8, 12);
//        theatre.getSeats();
//        if(theatre.reserveSeat("A01")){
//            System.out.println("Pay money");
//        }else {
//            System.out.println("Sorry, seat is taken");
//        }
//        if(theatre.reserveSeat("A01")){
//            System.out.println("Pay money");
//        }else {
//            System.out.println("Sorry, seat is taken");
//        }
    }
    public static void printList(List<Theatre.Seat> list){
        for(Theatre.Seat item : list){
            System.out.println(" " + item.getSeatNumber());
        }
        System.out.println();
    }
}
