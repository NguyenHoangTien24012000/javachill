package OOP.LuyenTapOOP;

public class DeluxeBurger extends Burger{
    Item deluxe1;
    Item deluxe2;

    public DeluxeBurger(String name, double price) {
        super(name, price);
    }

    public void addTopping(String nameTopping1, String nameTopping2, String nameTopping3, String deluxe1, String deluxe2) {
        super.addTopping(nameTopping1, nameTopping2, nameTopping3);
        this.deluxe1 = new Item(deluxe1, "TOPPING", 0.0);
        this.deluxe2 = new Item(deluxe2, "TOPPING", 0.0);
    }

    @Override
    public void printItemList() {
        super.printItemList();
        if(deluxe1 != null){
            deluxe1.printItem();
        }
        if(deluxe2 != null){
            deluxe2.printItem();
        }
    }

    @Override
    public double getAdjustedPrice() {
        return 0.0;
    }
}
