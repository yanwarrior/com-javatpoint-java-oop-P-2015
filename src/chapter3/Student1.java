package chapter3;

public class Student1 {
    
    int id; // data member (also instance variable)
    String name; // data member (also instance variable)
    
    public static void main(String[] args) {
        Student1 s1 = new Student1();
        System.out.println(s1.id);
        System.out.println(s1.name);
    }
}
