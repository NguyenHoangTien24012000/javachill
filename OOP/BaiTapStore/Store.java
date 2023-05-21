package OOP.BaiTapStore;

import java.util.ArrayList;

record OrderItem(int qyt, ProductForSale product){};
public class Store {
    public static ArrayList<ProductForSale> storeProducts = new ArrayList<>();

    public static void main(String[] args) {
        storeProducts.add(new BimBim("Khoai Tay", 5, "Lam tu chat lieu khoai tay nhieu chat dinh duong"));
        storeProducts.add(new BimBim("Ngo", 5.5, "Lam tu ngo rat ngon va thom"));
        printProducts();

        ArrayList<OrderItem> order1 = new ArrayList<>();
        addItemToOrder(order1, 0, 2);
        addItemToOrder(order1, 1, 3);
        printOrder(order1);
    }

    public static void printProducts(){
        for(var item : storeProducts){
            System.out.println("-".repeat(40));
            item.showDetail();
        }
    }

    public static void addItemToOrder(ArrayList<OrderItem> order, int orderIndex, int qyt){
        order.add(new OrderItem(qyt, storeProducts.get(orderIndex)));
    }

    public static void printOrder(ArrayList<OrderItem> order){
        double total = 0;
        for(var item : order){
            item.product().printPriceItem(item.qyt());
            total += item.product().getSalesPrice(item.qyt());
        }
        System.out.println("-".repeat(40));
        System.out.printf("Total price: %8.2f %n", total);
//        Calendar
    }
}
