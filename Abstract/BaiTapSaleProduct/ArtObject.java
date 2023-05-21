package Abstract.BaiTapSaleProduct;

public class ArtObject extends ProductForSale{
    public ArtObject(String type, String description, double price) {
        super(type, description, price);
    }

    @Override
    void showDetails() {
        System.out.println("This " + type + " is a beautiful reproduction!");
        System.out.printf("The price of piece is %6.2f %n",price);
        System.out.println(description);
    }
}
