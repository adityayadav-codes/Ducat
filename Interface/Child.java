// interface My {
//     static void show() {
//         System.out.println("show interface from My");
//     }
// }
// public class Child implements My {
//     public static void main (String [] args) {
//         My.show();
//     }
// }

// // Non - static method in interface
// interface My {
//     default void show() {
//         System.out.println("Show from interface My");
//     }
// }
// public  class Child implements My {
//     public void show() {
//         System.out.println("Show from child class");
//     }
//     public static void main(String [] args) {
        
//         Child c1 = new Child();
//         c1.show();
//     }
// } 

// Default Mehtod in interface
// interface My {
//     void show();
// }
// class Child implements My {
//     public void show() {
//         System.out.println("show from child ");
//     }

//     public static void main(String [] args) {
//         Child c1 = new Child();
//         c1.show();
//     }
// }

// Multiple Inheritance via Interface

interface My {
    void show();
}
interface Mine {
    void show();
}
public class Child implements My, Mine {
    public void show() {
        System.out.println("show from class Child");
    }
    public static void main(String [] args) {
        Child c1 = new Child();
        c1.show();
    }
}