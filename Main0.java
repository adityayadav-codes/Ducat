// //1.

// //write a java program that uses the += operator assignment to add the value 5 to a variable x and prints the result.
//  class eightennocto {
    
//     public static void main (String [] args)  {

//         int x = 5;
//         x +=5;
//         System.out.println("The result of x after adding 5 is: " + x);
        
//     }
// }
// //create a java program that uses the -= operator assignment to subtract the value 3 from a variable y and prints the result.

// //2.

// public class Main0 {
//     public static void main (String [] args)  {

//     int y = 10;
//     y -= 3;
//     System.out.println("The result of y after subtracting  3 is: " + y );
        
//     }
// }

// //3.

// //write a java program that uses the *= operator assignment to multiply a variable z by 2 and prints the result.
//   public class Main0 {
//       public static void main(String [] args)	{

// 	    int z = 5;
// 	    z *=2;
// 	    //console
// 	    System.out.println("the multiplication of z by 2 is  "+z);
	
//      }
//  }

// //4.

// //develop a java program that uses the /= operator assignment to divide a variable a by 2 and prints the result.
//  public class Main0 {
//     public static void main(String []args)	{
// 	    int a =10;
// 	    a /=2;
// 	        System.out.println("The division of a by 2 is "+a);
    
//    }
//  }

// // 5.

// // create a java program that uses the %= operator assignment to find the remainder when a variable b is divided by 3 and prints the result.

// public class Main0 {
//     public static void main(String []args)	{
//         int b =10;
//         b %=3;
//             System.out.println("The remainder when b is divided by 3 is "+b);
    
//    }
// }

// //6.

//  //write a java program that uses operator asssignment to calculate  the sum of all numbers in an array and prints the result.
//     public class Main0 {
    
//         public static void main(String [] args)	{
	
// 	int [] number = {1,2,3,4,5};
// 	int sum =0;
// 	 for (int I =0;  I < 5 ;I++)	{
		
// 		sum += number[I];
		
// 	}
// 		System.out.print("The sum  of all array elements:"+sum);
// 		System.out.println();
// }
//     }

// //7.

// //deveop a java program that uses operator assignment to calculate the product of all numbers in an array and prints the result.
//     public class Main0 {
    
//         public static void main(String [] args)	{
	
// 	int [] number = {1,2,3,4,5};
// 	int mul =1;
// 	 for (int I =0;  I < 5 ;I++)	{
		
		
//         mul *= number[I];
		
// 	}
// 		System.out.print("The multiple  of all array elements:"+mul);
// 		System.out.println();
// }
//     }

// // 8.

// //  create a java program that uses operator assignment to calculate the average of all numbers in an array and prints the result.
//     public class Main0 {
//          public static void main(String [] args)	{
// 	    int []num = {2, 4, 6, 8, 10, 12,14,16,18,20};
// 	    int sum =0;
// 	    int totalNum = 10;	//total number is 10
//  	    int avg;
// 	      for (int i = 0; i < 10; i++)	{
	
// 		    sum +=num[ i ];		
// }
// 	    avg = sum/totalNum;
// 	    System.out.print("the average of an elements of array is "+avg);
	
// }

// }

public class Main0 {
    
    public static void main(String[] args) {
        double totalCost = 0;
        double item1 = 10.99;
        double item2 = 5.99;
        double item3 = 7.99;
        double salesTaxRate = 0.08;

        // Calculate subtotal
        totalCost += item1;
        totalCost += item2;
        totalCost += item3;

        // Calculate sales tax
        double salesTax = totalCost * salesTaxRate;

        // Calculate total cost
        totalCost += salesTax;

        System.out.println("Subtotal: $" + (totalCost - salesTax));
        System.out.println("Sales tax: $" + salesTax);
        System.out.println("Total cost: $" + totalCost);
    }
}
