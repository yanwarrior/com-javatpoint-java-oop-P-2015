package chapter7;

public class A {
    
    A getA() {
        return this;
    }
    
    void msg() {
        System.out.println("Hello Java");
    }
}

class Test1 {
    public static void main(String[] args) {
        new A().getA().msg();
    }
}
