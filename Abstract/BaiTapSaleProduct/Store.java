package Abstract.BaiTapSaleProduct;

import java.util.ArrayList;

record OrderItem(int qty, ProductForSale productForSale){

}
public class Store {
    private static ArrayList<ProductForSale> storeProduct = new ArrayList<>();

    public static void main(String[] args) {
        storeProduct.add(new ArtObject("Bim Bim", "Ngon ngon cho tre con", 1.5));
        storeProduct.add(new ArtObject("Kem", "Ngon ngon cho ca tre con va nguoi lon", 2.0));
        storeProduct.add(new ArtObject("Thuoc la", "Khong ngon cho tre con, ngon cho nguoi lon", 2.5));
        listProduct();
        ArrayList<OrderItem> order1 = new ArrayList<>();
        addItemToOrder(order1, 0, 3);
        addItemToOrder(order1, 2, 1);
        printOrder(order1);
    }
    public static void listProduct(){
        for(var itemProduct : storeProduct){
            itemProduct.showDetails();
            System.out.println("-".repeat(40));
        }
    }

    public static void addItemToOrder(ArrayList<OrderItem> order, int orderIndex, int qyt){
        order.add(new OrderItem(qyt, storeProduct.get(orderIndex)));
    }
    public static void printOrder(ArrayList<OrderItem> order){
        double salesTotal = 0;
        for(var itemOrder : order){
            itemOrder.productForSale().printPricedItem(itemOrder.qty());
            salesTotal += itemOrder.productForSale().getSalesPrice(itemOrder.qty());
        }
        System.out.printf("Sale Total: $%6.2f %n", salesTotal);
    }
}
