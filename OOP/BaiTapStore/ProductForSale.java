package OOP.BaiTapStore;

abstract public class ProductForSale {
    protected String type;
    protected double price;
    protected String description;

    public ProductForSale(String type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    public void printPriceItem(int qyt){
        System.out.printf("%2d qty at $%8.2f each, %-15s %-35s %n", qyt, price, type, description);
    }

    public double getSalesPrice(int qty){
        return qty * price;
    }

    public abstract void showDetail();
}

class BimBim extends ProductForSale{
    public BimBim(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetail() {
        System.out.printf("Loai Bim Bim %s nay rat ngon!!%n", type);
        System.out.println("Gia 1 goi Bim Bim nay la: " + price);
        System.out.println(description);
    }

}
