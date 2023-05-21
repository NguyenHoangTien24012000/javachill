package Abstract.BaiTapSaleProduct;

public abstract class ProductForSale {
    protected String type;
    protected String description;
    protected double price;

    public ProductForSale(String type, String description, double price) {
        this.type = type;
        this.description = description;
        this.price = price;
    }

    public double getSalesPrice(int qty){
        return qty*price;
    }

    public void printPricedItem(int qty){
        System.out.printf("%2d qty at $%8.2f each total: %8.2f, %15s %35s %n", qty, price, getSalesPrice(qty),type, description);
    }

    abstract void showDetails();
}
