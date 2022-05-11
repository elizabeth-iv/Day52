public class Product {

    private String productName;
    private double productCost;
    private int productQuant;

    public Product (String productName, double productCost, int productQuant) {
        this.productName = productName;
        this.productCost = productCost;
        this.productQuant = productQuant;
    }

    public String printProduct() {
        return "Item: " + productName + " costs $" + productCost + " and " + productQuant + " units were purchased";
    }

    public String totalCost() {
        return "Total cost is $" + productQuant * productCost;
    }
}
