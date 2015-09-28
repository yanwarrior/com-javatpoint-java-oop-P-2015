package chapter3;

public class Student2 {
    
    int rollno;
    String name;
    
    void insertRecord(int r, String n) {
        rollno = r;
        name = n;
    }
    
    void displayInformation() {
        System.out.println(rollno + " " + name);
    }
    
    public static void main(String[] args) {
        Student2 s1 = new Student2();
        Student2 s2 = new Student2();
        
        s1.insertRecord(111, "Aryan");
        s2.insertRecord(222, "Karan");
        
        s1.displayInformation();
        s2.displayInformation();
    }
}
