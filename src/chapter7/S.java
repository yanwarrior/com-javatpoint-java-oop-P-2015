package chapter7;

public class S {
    
    void m() {
        System.out.println("method is invoked");
    }
    
    void n() {
        // no need because compiler does it for you
        this.m();
    }
    
    void p() {
        // compiler will add this
        // to invoke n() method as this.n()
        n();
    }
    
    public static void main(String args[]) {
        S s1 = new S();
        s1.p();
    }
}
