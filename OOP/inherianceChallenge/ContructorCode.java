package OOP.inherianceChallenge;

public class ContructorCode {
    private double x;
    private double y;
    private double width;
    private double height;
    public ContructorCode(){
        this(0, 0);
    }
    public ContructorCode(double width, double height){
        this(0, 0, width, height);
    }
    public ContructorCode(double x, double y, double width, double height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
}
