import java.util.Scanner;
public class DemoExce {
    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.println("Enter the first number: ");
            int a = sc.nextInt();
            
            System.out.println("Enter the second number: ");
            int b = sc.nextInt();

            int result = a/b;
            System.out.println("Result : "+result);
        }
        catch(ArithmeticException e){

            System.out.println("Cannot divide by zero!");
        }
    }
}