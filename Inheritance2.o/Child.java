class Base {
    int x; 
    int y;
    void show() {
        System.out.println(x);
        System.out.println(y);
    }
}
public class Child extends Base {

     void get(int x, int y){
        this.x = x;
        this.y = y;
     }

     public static void main(String[] args) {
        Child c1 = new Child();
        c1.get(10, 20);
        c1.show();
     }
}

super Keyworkd:
class Base {

     int x = 10;
}
public class Child extends Base{

    int x = 20;
     void show() {
        System.out.println("x : "+x);
        System.out.println("x : "+(this.x));

     }

     public static void main(String[] args) {
        Child c1 = new Child();
        c1.show();
     }
}


======================Stronger to Weaker (Access Specifier)===============
class Base {
   protected void show() {
        System.out.println("show from Base class");
    }
}
public class Child  extends Base{

  public void show () {
        System.out.println("show from child class");
        super.show();
    }

    public static void main(String [] args) {

        Child c1 = new Child();
        c1.show();
    }
    
    
}


// Access Modifier :-

class Base {

        static void show() {
            System.out.println("show from Base clss");
        }

}
public class Child extends Base{

    static void show() {
        System.out.println("show from Child class");
   
    }

    public static void main(String [] args) {

        Child c1 = new Child();
        c1.show();
    }
}


// upcasting & downcasting

// class Base {
//     void show() {
//         System.out.println("show from base class");
//     }
// }
// class Child extends Base {

//     void show() {
//         System.out.println("show from child class");
//     }
//     void display() {
//         System.out.println("Display from child class");
//     }

//     public static void main(String[] args) {
//         Base c1 = new Child(); // upcasting
//         c1.show();
//     }
// }

class Base {
    void show() {
        System.out.println("Show from Base class");
    }
}
public class Child extends Base {
    void show() {
        System.out.println("show form Child class");
    }
    void display() {
       System.out.println("display from child clas");
    }
    public static void main(String[] args) {
         Base c1 = new Child();
         c1.show();
         Child c2 = (Child)c1;// downcasting
         c2.display();
    }
}