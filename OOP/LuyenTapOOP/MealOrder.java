package OOP.LuyenTapOOP;
public class MealOrder {
    private Item side;
    private Item drink;
    private Burger burger;

    public MealOrder(String side, String drink, String burgerType){
        this.side = new Item(side, "Side", 3.0);
        this.drink = new Item(drink, "Drink", 2.0);
        if(burgerType.equalsIgnoreCase("deluxe")){
            this.burger = new DeluxeBurger(burgerType, 8.5);
        }else{
            this.burger = new Burger(burgerType, 5.0);
        }
    }
    public MealOrder(){
        this("BanhKem", "CocaCola", "BanhMyPate");
    }
    public double totalPrice(){
        return burger.getAdjustedPrice() + drink.getAdjustedPrice() + side.getAdjustedPrice();
    }
    public void printItemizedList(){
        burger.printItemList();
        if(burger instanceof DeluxeBurger){
            Item.printItem(drink.getName(), 0);
            Item.printItem(side.getName(), 0);
        }else{
            side.printItem();
            drink.printItem();
        }
        System.out.println("-".repeat(30));
        Item.printItem("Total price", totalPrice());
    }
    public void setDrinkSize(String size){
        drink.setSize(size.toUpperCase());
    }
    public void addTopping(String topping1, String topping2, String topping3, String topping4, String topping5){
        if(burger instanceof DeluxeBurger db){
            db.addTopping(topping1, topping2,topping3,topping4,topping5);
        }else{
            burger.addTopping(topping1, topping2, topping3);
        }
    }

}
