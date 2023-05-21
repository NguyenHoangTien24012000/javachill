package OOP.PolymorphismChallenge;

public class Burger extends Item{
    private Item extra1;
    private Item extra2;
    private Item extra3;

    public Burger(String name, double price) {
        super(name, "Burger", price);
    }

    @Override
    public String getName() {
        return super.getName() + " Burger";
    }

    @Override
    public double getAdjustedPrice() {
        return getBasePrice() +
                (extra1 == null ? 0 : extra1.getBasePrice()) +
                (extra2 == null ? 0 : extra2.getBasePrice()) +
                (extra3 == null ? 0 : extra3.getBasePrice());
    }
    public double getExtraPrice(String toppingName){
        return switch(toppingName.toUpperCase()){
            case "AVOCADO", "CHEESE" -> 1.0;
            case "BACON", "HAM", "SALAMI" -> 1.5;
            default -> 0.0;
        };
    }
    public void addTopping(String extra1, String extra2, String extra3){
        this.extra1 = new Item(extra1,"Topping", getExtraPrice(extra1));
        this.extra2 = new Item(extra2, "Topping", getExtraPrice(extra2));
        this.extra3 = new Item(extra3, "Topping", getExtraPrice(extra3));
    }

    public void printItemList(){
        printItem("Base Burger", getBasePrice());
        if(extra1 != null){
            extra1.printItem();
        }
        if(extra2 != null){
            extra2.printItem();
        }
        if (extra3 != null){
            extra3.printItem();
        }

    }

    @Override
    public void printItem() {
        printItemList();
        System.out.println("-".repeat(40));
        super.printItem();
    }
}
