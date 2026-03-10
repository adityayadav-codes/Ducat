//Arithmetic Exception===========
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

// Array Index out o Bound Exception ===================

// public class DemoExce {
//     public static void main(String[] args) {
        
//         int arr[] = {10,20,30,40};

//         try {
//             System.out.println(arr[8]);
//         }
//         catch(ArrayIndexOutOfBoundsException e) {

//             System.out.println("Array index out of range");
//         }
//     }
// }

// Example 2 =======
public class DemoExce {
    public static void main(String [] args) {
        int arr[ ] = {10,30,50,70,};

        try {
            System.out.println(arr[10]) 
        }
        catch (ArrayIndexOutOfBoundsException) {
            System.out.println(Array index out of range)
        }
    }
}