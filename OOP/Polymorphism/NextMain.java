package OOP.Polymorphism;

public class NextMain {
    public static void main(String[] args) {
        Movie theMovie = Movie.getMovie("A", "Test");
        theMovie.watchMovie();

        Adventure jaws = (Adventure) Movie.getMovie("A", "TEST2");
        jaws.watchMovie();
//        Adventure jaws2 = (Adventure) Movie.getMovie("C", "TEST3");
//        jaws2.watchMovie();
        Object comedy = Movie.getMovie("C", "TEST 3");
        Comedy comedyMovie =(Comedy) comedy;
        comedyMovie.watchMovie();

        var airPlane = Movie.getMovie("C", "TEST 4");
        airPlane.watchMovie();

        Object unknownMovie = Movie.getMovie("a", "TEST 5");
        if(unknownMovie.getClass().getSimpleName() == "Comedy"){
            Comedy test = (Comedy) unknownMovie;
            test.watchComedy();
        }else if(unknownMovie instanceof Adventure){
            Adventure test = (Adventure) unknownMovie;
            test.watchMovie();
        } else if (unknownMovie instanceof ScienceFiction test1) {
            test1.watchScience();
        }
    }
}
