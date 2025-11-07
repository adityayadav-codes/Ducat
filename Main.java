// public class Main {
//     public static void main(String[] args) {
//         int a = 10;
//         int b = 20;
//            void addition(){
//             return a + b;
//          }
//           void subtraction() {
//             return b - a;
//          }
//          int choice = 2;
//          do {
//             switch (choice) {
//                 case 1:
//                     {   
//                         System.out.println(addition());
//                         break;
//                     }  
//                     case 2:
//                     {   
//                         System.out.println(subtraction());
//                         break;
//                     }      
//                     default:
//                     break;
//             }
//          } while (choice>=0);
//     }
// }

// public class Main {
//     public static void main(String[] args) {
        
    
//     int  [] arr = {10, 20, 30, 40, 50};
//         for(int i : arr){
//             System.out.println(i);
//         }
//     }
// }


// //max
// public class Main {

//     public static void main(String[] args) {
//         int [] arr = {10,20,30,40,50};
//         int max = arr[0];
//         for(int i =0; i < arr.length; i++) {
//             if(arr[i] > max) {
//                 max = arr[i];
//             }
//         }
//         System.out.println(max);
//     }
// }
// // min
// public class Main {
//         public static void main(String[] args) {
//             int [] arr = {10, 20, 30, 40, 5};   
//                 int min = arr[0];
//                for(int i =0; i <arr.length;i++){
//                     if(arr[i] < min) {
//                         min = arr[i];
//                     }
//                 }
//                 System.out.println(min);
            
//         }
// }
//average

public class Main {

    public static void main(String[] args) {
        int sum = 0;
        double average;
        int []arr = {10,20,30,40,50};
        for(int i =0; i < arr.length; i++) {
            sum += arr[i];
              
        }
        average = (double)sum/arr.length; 
         System.out.println("average: "+average);
    }
}