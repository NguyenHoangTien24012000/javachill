package OOP.LuyenTapDaHinh;

public class Burger extends Item{
    private Item extra1;
    private Item extra2;
    private Item extra3;

    public Burger(String name, double price) {
        super(name, "burger", price);
    }

    @Override
    public String getName() {
        return super.getName() + " Burger";
    }

    @Override
    public double getAdjustedPrice() {
        return getBasePrice() +
                (extra1 == null ? 0 : extra1.getAdjustedPrice()) +
                (extra2 == null ? 0 : extra2.getAdjustedPrice()) +
                (extra3 == null ? 0 : extra3.getAdjustedPrice());
    }
    public double getExtraPrice(String toppingName){
        return switch (toppingName.toUpperCase()){
            case "SUGAR" -> 0.5;
            case "CHEESE" -> 1.0;
            case "MILK" -> 1.5;
            default -> 0.0;
        };
    }
    public void addTopping(String topping1, String topping2, String topping3){
        this.extra1 = new Item(topping1, "TOPPING", getExtraPrice(topping1));
        this.extra2 = new Item(topping2, "TOPPING", getExtraPrice(topping2));
        this.extra3 = new Item(topping3, "TOPPING", getExtraPrice(topping3));
    }
    public void printItemList(){
        printItem("BASE BURGER", getBasePrice());
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
    public void printItem(){
        printItemList();
        System.out.println("-".repeat(30));
        printItem();
    }

}
