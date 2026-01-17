import java.util.Scanner;

public class cons {

        int a; 
        int b;
        cons(int x, int y) {
            a =x;
            b = y;
        }
        void display() {
            System.out.println("a: " + a + " b: " + b);
            System.out.println("Sum: " + (a + b));
            System.out.println("Product: "+(a * b));
            System.out.println("Difference: "+(b - a));
            System.out.println("Quotient: "+(b / a));
            System.out.println("Remainder: "+(b % a));
            System.out.println("-----------------------------------");
        }
        public static void main(String [] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter two integers: ");
            int a  = sc.nextInt();
            int b = sc.nextInt();
            cons obj = new cons(a, b);
            obj.display();
            sc.close();
        }
     
}