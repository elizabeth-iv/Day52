public class ProductMain {

    public static void main(String[] args) {

        Product product = new Product("Gallon of Gas", 4.0, 10);

        System.out.println(product.printProduct());
        System.out.println(product.totalCost());
    }
}
