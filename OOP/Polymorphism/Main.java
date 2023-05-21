package OOP.Polymorphism;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Movie theMovie = Movie.getMovie("A", "Test");
//        theMovie.watchMovie();
        Scanner s = new Scanner(System.in);
        while (true){
            System.out.println("Enter Type (A for Adventure, C for Comedy, S for ScienceFiction, Q for Quit: ");
            String type = s.nextLine();
            if("Qq".contains(type)){
                System.out.println("Bye bye");
                break;
            }
            System.out.println("Enter title film: ");
            String title = s.nextLine();
            Movie theMovie = Movie.getMovie(type, title);
            theMovie.watchMovie();
        }
    }
}
