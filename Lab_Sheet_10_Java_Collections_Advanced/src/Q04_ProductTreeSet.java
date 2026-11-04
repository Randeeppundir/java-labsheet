import java.util.TreeSet;

class Product implements Comparable<Product> {
    private final int id;
    private final String name;
    private final double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public double getPrice() { return price; }

    @Override
    public int compareTo(Product other) {
        int priceComparison = Double.compare(this.price, other.price);
        return priceComparison != 0 ? priceComparison : Integer.compare(this.id, other.id);
    }

    public void display() {
        System.out.printf("ID: %d, Product: %s, Price: ₹%.2f%n", id, name, price);
    }
}

public class Q04_ProductTreeSet {
    public static void main(String[] args) {
        TreeSet<Product> products = new TreeSet<>();
        products.add(new Product(1, "Keyboard", 1200));
        products.add(new Product(2, "Mouse", 650));
        products.add(new Product(3, "Monitor", 8500));
        products.add(new Product(4, "Headphones", 2100));
        products.add(new Product(5, "USB Drive", 500));

        System.out.println("Products sorted by price:");
        for (Product product : products) {
            product.display();
        }
    }
}
