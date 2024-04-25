public class Main {
    public static void main(String[] args) {
        // Create some sample products
        Product laptop = new ElectronicProduct("Laptop", 1000.0, "HP");
        Product smartphone = new ElectronicProduct("Smartphone", 500.0, "Samsung");
        Product book = new Product("Book", 20.0);

        // Create a product list and add products
        ProductList productList = new ProductList();
        productList.addProduct(laptop);
        productList.addProduct(smartphone);
        productList.addProduct(book);

        // Display all products in the list
        productList.displayProducts();
    }
}

