class Outerclass {

    String name = "Aditya Yadav";
     
    static int id = 111;

    public void fun1() {

        System.out.println(name);
        System.out.println(id);
    }

    public static void fun2() {

        System.out.println(name);
        System.out.println(id);
    }

    // innerclasss

   static class innerclasss {

        String str = "Hello";
        static String str2 = "hello2";

        public   void m1() {

            System.out.println(name);
            System.out.println(str);
            System.out.println(str2);
            System.out.println(id);
        }
    }
}

public class Demo {

    public static void main(String[] args) {
        
        // Outerclass outer = new Outerclass();

        Outerclass.innerclasss inner = new Outerclass.innerclasss();
        inner.m1();
    }
}