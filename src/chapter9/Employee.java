package chapter9;

public class Employee {
    
    int id;
    String name;
    Address address;
    
    public Employee(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }
    
    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: "+name);
        System.out.println("City: "+address.city);
        System.out.println("Country: " + address.country);
        System.out.println("State: " + address.state);
        System.out.println("");
    }
    
    public static void main(String args[]) {
        Address address1 = new Address("Jakarta", "Jakarta Barat", "Indonesia");
        Address address2 = new Address("Cibaduyut", "Bandung Selatan", "Indonesia");
        Employee e1 = new Employee(111, "Yanwar Solahudin", address1);
        Employee e2 = new Employee(222, "Hendri Kharisma", address2);
        e1.display();
        e2.display();
    }
}
