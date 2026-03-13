// public class DemoArrays {

//     public static void main(String [] args) {

//         int [] x = {10,20,30,40,50};

//         for(int i =0; i < x.length; i++) {
//             System.out.println(x[i]);
//         }
//     }
// }

// Multi-dimensional Arrays

// public class DemoArrays {
//     public static void main(String [] args) {

//         int [][]x = {{10,20,30}, {20,40,60}, {10,30,70}};
        
//         for(int i =0; i < x.length; i++) {

//             for(int j =0; j < x[i].length; j++) {

//                 System.out.print(x[i][j]+ " ");
//             }

//             System.out.println();
//          }
//     }
// // }
// public class DemoArrays {

//     public static void main(String [] args) {

//         int []arr = {1,2,3,4,5};

//         System.out.println("Reverse Number");
//         for(int i = arr.length-1; i > 0; i--) {

//             System.out.println(arr[i]);
//         }
//     }
// }

// Armstrong Number==========

// public class DemoArrays {

//     public static void main(String [] args) {

//         int num = 153;
//         int original = num;
//         int sum = 0;

//             while (num > 0) {
                
//                 int digit = num % 10;
//                 sum = sum + (digit * digit * digit);
//                 num = num / 10;
//             }

//             if(sum == original) {

//                 System.out.println("Armstrong Number");
//             } else {

//                 System.out.println("Not Armstrong number");
//             }
//     }
// }


// Second largest Number

public class DemoArrays {

     public static void main(String[] args) {
        
        int []arr = {20,10,50,70,40};
        int largest = arr[0];
        int secondLargest = arr[0];

            for(int i =1; i < arr.length; i++) {
                
                if(arr[i] > largest){

                    secondLargest = largest;
                    largest = arr[i];
                }
                else if(arr[i] > secondLargest && arr[i] != largest) {

                    secondLargest = arr[i];
                }
            }
        System.out.println("Second Larged Number: "+secondLargest);
     }
}