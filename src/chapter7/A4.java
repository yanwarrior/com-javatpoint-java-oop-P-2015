package chapter7;

class B {
    A4 obj;
    
    B(A4 obj) {
        this.obj = obj;
    }
    
    void display() {
        // using data member of A4 Class
        System.out.println(this.obj.data);
    }
}

public class A4 {
    
    int data = 10;
    
    A4() {
        B b = new B(this);
        b.display();
    }
    
    public static void main(String args[]) {
        A4 a4 = new A4();
    }
    
}
