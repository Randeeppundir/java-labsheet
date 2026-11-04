import java.util.Vector;

class Customer {
    private int id;
    private String name;
    private String email;

    public Customer(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Email: " + email);
    }
}

public class Q07_CustomerVector {
    public static void main(String[] args) {
        Vector<Customer> customers = new Vector<>();
        customers.add(new Customer(1, "Aman", "aman@example.com"));
        customers.add(new Customer(2, "Riya", "riya@example.com"));
        customers.add(new Customer(3, "Karan", "karan@example.com"));

        for (Customer customer : customers) {
            customer.display();
        }
    }
}
