package chapter7;

public class Student13 {
    
    int id;
    String name;
    
    Student13() {
        System.out.println("default constructor is invoked");
    }
    
    Student13(int id, String name) {
        // it is used to invoked
        // current class constructor
        this();
        this.id = id;
        this.name = name;
    }
    
    void display() {
        System.out.println(id+ " " +name);
    }
    
    public static void main(String args[]) {
        Student13 s1 = new Student13(111, "Karan");
        Student13 s2 = new Student13(222, "Aryan");
        s1.display();
        s2.display();
    }
}
