package HomeWorcks.home9.HomeWorck91;

public class Product {
    private double price;
    private String name;
    private String description;
    private int quantity;

    public void getStockOfProducts(int howMany) {
        this.quantity += howMany;
        System.out.println(howMany + " Products arrived in stock total stock: " + quantity);
    }

    public void fireSell(double procent){
        this.price = price / procent;
    }


    public void stockOnProducts() {
        if (this.quantity > 0) {
            System.out.println("We have on stock");
        }
    }
}
