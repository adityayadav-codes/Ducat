public class cons {

    cons() {
        System.out.println("hello from constructor");
    }
    void method() {
        System.out.println("hello from method");
    }
    public static void main(String [] args) {
        cons obj = new cons();
        obj.method();
    }
}