public class ProductMain {
    /*main method in the Product class
    Create a class with a main method where you instantiate a Product
    object with a product that comes to mind and then call the
    printProduct() and totalCost() methods in the class.
     */
    public static void main(String[] args) {
        int quantity = 7;
        Product shoes = new Product("Shoes", 120.00, quantity);
        shoes.printProduct(quantity);
        shoes.totalCost(quantity);
    }
}
