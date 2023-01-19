import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

class Product {
    int productId;
    String name;
    double price;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product Id: " + productId + " Name: " + name + " Price: " + price;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "Product1", 20.5));
        products.add(new Product(2, "Product2", 15.5));
        products.add(new Product(3, "Product3", 25.5));
        products.add(new Product(4, "Product4", 10.5));
        products.add(new Product(5, "Product5", 30.5));

        //Printing the least priced product
        Optional<Product> leastPriced = products.stream().min(Comparator.comparingDouble(Product::getPrice));
        if (leastPriced.isPresent()) {
            System.out.println("Least priced product: " + leastPriced.get());
        }
