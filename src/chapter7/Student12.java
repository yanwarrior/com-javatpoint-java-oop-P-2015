package chapter7;

public class Student12 {
    
    int id;
    String name;
    
    Student12(int i, String n) {
        id = i;
        name = n;
    }
    
    void display() {
        System.out.println(id + " " + name);
    }
    
    public static void main(String args[]) {
        Student12 s1 = new Student12(111, "Aryan");
        Student12 s2 = new Student12(222, "Karan");
        
        s1.display();
        s2.display();
    }
}
