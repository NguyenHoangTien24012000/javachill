package OOP.PolymorphismChallenge;

public class MealOrder {
    private Item side;
    private Item drink;
    private Burger burger;

    public MealOrder(Item side, Item drink, Burger burger) {
        this.side = side;
        this.drink = drink;
        this.burger = burger;
    }
    public void addTopping(String topping1, String topping2, String topping3){
        burger.addTopping(topping1, topping2, topping3);
    }
    public void setDrinkSize(String size){
        drink.setSize(size);
    }
}
