import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();  

        int[] arr = new int[n];  

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();  
        }

        System.out.println("Even numbers in array:");
        for (int num : arr) {  
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }
    }
}