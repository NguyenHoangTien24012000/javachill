package OOP.inheritanceStep2;

public class PersonalComputer {
    private ComputerCase computerCase;
    private Motherboard motherboard;
    private Monitor monitor;

    public PersonalComputer(ComputerCase computerCase, Motherboard motherboard, Monitor monitor) {
        this.computerCase = computerCase;
        this.motherboard = motherboard;
        this.monitor = monitor;
    }

    public void drawLogo(){
        monitor.drawPixelAt(1200, 50,  "yellow");

    }
    public void powerUp(){
        computerCase.pressPowerButton();
        drawLogo();
    }

//    public ComputerCase getComputerCase() {
//        return computerCase;
//    }
//
//    public Motherboard getMotherboard() {
//        return motherboard;
//    }
//
//    public Monitor getMonitor() {
//        return monitor;
//    }
}
