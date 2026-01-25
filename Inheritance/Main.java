class A {
    void parent(){
        System.out.println("Parennt Class!");
    }
}
class B  extends A{
    void child() {
        System.out.println("Child Class!");
    }
}
public class Main {
    public static void main(String[] args) {
        B b1 = new B();
        b1.child();
        b1.parent();
    }
    
}
