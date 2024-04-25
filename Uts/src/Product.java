import java.util.ArrayList;
import java.util.List;

// Superclass Product
class Product {
    private String name;
    private double price;

    // Constructor
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    // Method to display product information
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Price: $" + price);
    }
}

// Subclass for a specific type of product: ElectronicProduct
class ElectronicProduct extends Product {
    private String brand;

    // Constructor
    public ElectronicProduct(String name, double price, String brand) {
        super(name, price);
        this.brand = brand;
    }

    // Getter method
    public String getBrand() {
        return brand;
    }

    // Method to display electronic product information
    @Override
    public void display() {
        super.display();
        System.out.println("Brand: " + brand);
    }
}

// Class to manage list of products
class ProductList {
    private List<Product> productList;

    // Constructor
    public ProductList() {
        productList = new ArrayList<>();
    }

    // Method to add a product to the list
    public void addProduct(Product product) {
        productList.add(product);
    }

    // Method to display all products in the list
    public void displayProducts() {
        if (productList.isEmpty()) {
            System.out.println("No products in the list.");
        } else {
            System.out.println("List of Products:");
            for (Product product : productList) {
                product.display();
                System.out.println(); // Blank line for separation
            }
        }
    }
}

// Main class to test the program
