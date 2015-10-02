package chapter7;

public class Student14 {
    
    int id;
    String name;
    String city;
    
    Student14(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    Student14(int id, String name, String city) {
        // now no need to initialize id and name
        this(id, name);
        this.city = city;
    }
    
    void display() {
        System.out.println(id+" "+name+" "+city);
    }
    
    public static void main(String args[]) {
        Student14 s1 = new Student14(111, "Karan");
        Student14 s2 = new Student14(222, "Yanwar", "Indonesia");
        s1.display();
        s2.display();
    }
}
