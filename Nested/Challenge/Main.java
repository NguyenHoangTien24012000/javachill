package Nested.Challenge;

public class Main {
    public static void main(String[] args) {
        Meal meal = new Meal();
        System.out.println(meal.toString());
        Meal mealAustralia = new Meal(0.5);
        mealAustralia.addTopping("sugar", "milk");
        System.out.println(mealAustralia.toString());
    }
}
