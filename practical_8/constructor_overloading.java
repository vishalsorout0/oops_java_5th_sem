
class Product {
    String name;
    double price;
    int quantity;

    // No-argument constructor
    Product() {
        name = "Unknown";
        price = 0.0;
        quantity = 0;
    }

    // Constructor with product name
    Product(String n) {
        name = n;
        price = 0.0;
        quantity = 0;
    }

    // Constructor with product name and price
    Product(String n, double p) {
        name = n;
        price = p;
        quantity = 0;
    }

    // Constructor with all three fields
    Product(String n, double p, int q) {
        name = n;
        price = p;
        quantity = q;
    }

    double totalCost() {
        return price * quantity;
    }

    void display() {
        System.out.println("Product Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + totalCost());
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        Product p1 = new Product();
        Product p2 = new Product("Laptop");
        Product p3 = new Product("Mouse", 500);
        Product p4 = new Product("Keyboard", 1000, 2);

        System.out.println("No-argument Constructor:");
        p1.display();

        System.out.println("Name-only Constructor:");
        p2.display();

        System.out.println("Name and Price Constructor:");
        p3.display();

        System.out.println("All-fields Constructor:");
        p4.display();
    }
}
