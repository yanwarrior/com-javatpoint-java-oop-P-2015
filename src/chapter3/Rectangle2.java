package chapter3;

public class Rectangle2 {
    
    int length;
    int width;
    
    void insert(int l, int w) {
        length = l;
        width = w;
    }
    
    void calculateArea() {
        System.out.println(length * width);
    }
    
    public static void main(String[] args) {
        // creating two objects
        Rectangle2 r1 = new Rectangle2(), r2 = new Rectangle2();
        
        r1.insert(11, 5);
        r2.insert(3, 15);
        
        r1.calculateArea();
        r2.calculateArea();
    }
}
