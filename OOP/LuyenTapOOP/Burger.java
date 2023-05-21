package OOP.LuyenTapOOP;

public class Burger extends Item{
    private Item extra1;
    private Item extra2;
    private Item extra3;

    public Burger(String name, double price) {
        super(name, "Burger", price);
    }

    @Override
    public String getName() {
        return "Burger " + getName();
    }

    public void addTopping(String nameTopping1, String nameTopping2, String nameTopping3){
        this.extra1 = new Item(nameTopping1, "Topping", getExtraPrice(nameTopping1));
        this.extra2 = new Item(nameTopping2, "Topping", getExtraPrice(nameTopping2));
        this.extra3 = new Item(nameTopping3, "Topping", getExtraPrice(nameTopping3));
    }
    public double getExtraPrice(String nameTopping){
        return switch (nameTopping.toUpperCase()){
            case "PHOMAI", "KEM" -> 1.0;
            case "CHEESE" -> 1.5;
            default -> 0.5;
        };
    }

    @Override
    public double getAdjustedPrice() {
        return this.getBasePrice() +
                (extra1 == null ? 0 : extra1.getBasePrice()) +
                (extra2 == null ? 0 : extra2.getBasePrice()) +
                (extra3 == null ? 0 : extra3.getBasePrice());
    }
    public void printItemList(){
        this.printItem("Base burger", this.getBasePrice());
        if(extra1 != null){
            extra1.printItem();
        }
        if(extra2 != null){
            extra2.printItem();
        }
        if(extra3 != null){
            extra3.printItem();
        }
    }

    @Override
    public void printItem() {
        printItemList();
        System.out.println("-".repeat(30));
        super.printItem();
    }
}
