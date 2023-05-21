package OOP.LuyenTapDaHinh;

public class MealOrder {
    private Burger burger;
    private Item drink;
    private Item side;

    public MealOrder() {
        this("regular", "coca", "fries");
    }

    public MealOrder(String burgerType, String drinkType, String sideType) {
        this.burger = new Burger(burgerType, 4.0);
        this.drink = new Item(drinkType, "drink", 2.0);
        this.side = new Item(sideType, "side", 1.5);
    }
    public double getTotalPrice(){
        return burger.getAdjustedPrice() + drink.getAdjustedPrice() + side.getAdjustedPrice();
    }
    public void printItemList(){
        burger.printItem();
        drink.printItem();
        side.printItem();
        System.out.println("-".repeat(50));
        Item.printItem("Total", getTotalPrice());
    }
    public void addToppingBurger(String topping1, String topping2, String topping3){
        burger.addTopping(topping1, topping2,topping3);
    }
    public void setSizeDrink(String size){
        drink.setSize(size);
    }
}
