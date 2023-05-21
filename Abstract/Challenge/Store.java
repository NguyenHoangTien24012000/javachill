package Abstract.Challenge;

import java.util.ArrayList;

record OrderItem(int qty, ProductForSale product){};

public class Store {
    public static ArrayList<ProductForSale> storeProducts = new ArrayList<>();
    public static void main(String[] args) {
        storeProducts.add(new ArtObject("Oil Painting", 10.5, "asfsadfsadfasfasfasdf"));
        storeProducts.add(new ArtObject("Water", 5.0, "ngon oi la ngon"));
        listProducts();
        System.out.println("Order");
        ArrayList<OrderItem> order1 = new ArrayList<>();
        addItemToOrder(order1, 1, 2);
        addItemToOrder(order1, 0 , 3);
        printOrder(order1);

    }
    public static void listProducts(){
        for(var item : storeProducts){
            System.out.println("-".repeat(30));
            item.showDetails();
        }
    }
    public static void addItemToOrder(ArrayList<OrderItem> order, int orderIndex, int qty){
        order.add(new OrderItem(qty, storeProducts.get(orderIndex)));
    }
    public static void printOrder(ArrayList<OrderItem> order){
        double salesTotal = 0;
        for (var item : order){
            item.product().printPricedItem(item.qty());
            salesTotal += item.product().getSalesPrice(item.qty());
        }
        System.out.printf("Sale total price = %6.2f %n", salesTotal);
    }
}
