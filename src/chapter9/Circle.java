package chapter9;

class Operation {
    
    int square(int n) {
        return n*n;
    }
}

public class Circle {
    
    Operation op; // aggregation
    double pi = 3.14;
    int radius = 0;
    
    Circle(int radius, Operation op) {
        this.radius = radius;
        this.op = op;
    }
    
    double area() {
        // code reusability (i.e. delegates the method call)
        int square = op.square(radius);
        return pi * square;
    }
    
    public static void main(String args[]) {
        Circle c = new Circle(5, new Operation());
        double result = c.area();
        System.out.println(result);
    }
    
}
