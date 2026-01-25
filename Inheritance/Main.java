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

// 1 method:- instance methd calling

//  public class Main {
 
//     void show() {
//         System.out.println("show method");
//     }

//     public static void main(String[] args) {
//         Main obj = new Main();
//         obj.show();
//     }
//  }

// 2 method :- static method calling

// public class Main {

//      static void show () {
//         System.out.println("static method calling ");
//      }
//      public static void main(String [] args) {
//         Main.show();
//      }
// }

// 3 method :- nethod calling inside another method
    // with  an object:

// public class Main {
//     void show () {
//         System.out.println("show method calling");
//     }
//     void show2 () {
//         show();
//     }
//     public static void main(String[] args) {
//         Main obj = new Main();
//         obj.show2();
//     }
// }

// // with a class
// public class Main {

//   static  void show(){
//         System.out.println("method calling inside another method");
//     }
//    static void show2() {
//         show();
//     }
//     public static void main(String [] args) {
//         Main.show();
//     }
// }

// 4. Method calling in Another class

// class Temp {

//     void show(){
//         System.out.println("method calling in another class");
//     }
// }
// public class Main {

//         public static void main(String[] args) {
//         Temp obj = new Temp();
//         obj.show();
//         }
// }
// 5. Method calling in Inheritance

class Parent {
    void show() {
        System.out.println("Method calling in Inheritance");
    }
}
class child extends Parent {
    void show2(){
        show();
    }
}
public class Main {
    public static void main(String[] args) {
        child obj = new child();
     obj.show2();
    }
}