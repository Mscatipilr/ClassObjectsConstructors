public class Product {
    //attributes
    private String name;
    private double price;
    private int quantity;

    //constructor
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;

    }

    //methods
    public void printProduct(int quantity) {
        System.out.println(name + " costs $" + price + " each and " + quantity + " units were purchased.");
    }
    public void totalCost(int quantity) {
        System.out.println("Total cost is $" + (price * quantity) + ".");
    }

}


