// class A {
//     void parent(){
//         System.out.println("Parennt Class!");
//     }
// }
// class B  extends A{
//     void child() {
//         System.out.println("Child Class!");
//     }
// }
// public class Main {
//     public static void main(String[] args) {
//         B b1 = new B();
//         b1.child();
//         b1.parent();
//     }
    
// }


//  Single Inheritance===============
 
// class ParentClass {
//     void parent() {
//         System.out.println("Parent Class!!!");
//     }
// }
// class childClass extends ParentClass {
//     void child() {
//         System.out.println("Child Class");
//     }
// }
// public class Main {
//     public static void main(String [] args) {
//         childClass c1 = new childClass();
//         c1.child();
//         c1.parent();
//     }
// }

// ============ Method Calling ==========================
 public class Main {
 
    void show() {
        System.out.println("show method");
    }

    public static void main(String[] args) {
        Main obj = new Main();
        obj.show();
    }
 }