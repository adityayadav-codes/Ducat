/*
    *
    * *
    * * * 
    * * * * 
//  */
// public class Temp0 {
//     public static void main (String args []) {

//         for(int i = 1; i <= 4; i++) {

//             for(int j =1; j <= i; j++) {

//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }
/*
    1 
    1 2
    1 2 3 
    1 2 3 4 
//  */
//     public class Temp0 {
    
//         public static void main(String[] args) {
            
//             for(int i =1; i <= 4; i++) {

//                 for (int j = 1; j <= i; j++) {

//                     System.out.print(j + " ");
//                 }
//                 System.out.println();
//             } 
//         }
//     }
/*
    * * * *
    * * * *
    * * * *
    * * * *
//  */
// public class Temp0 {

//     public static void main (String args []) {

//         for(int i = 1; i <= 4; i++) {

//             for(int j = 1; j <= 4; j++) {

//                 System.out.print("*" + " ");
//             }
//             System.out.println();
//         }
//     }
// }
/*
    1
    1 2 
    1 2 3 
    1 2 3 4 
//  */
// public class  Temp0{

//     public static void main(String[] args) {
        
//         for(int i = 1; i <= 4; i++) {

//                 if(i==3){
//                     continue;
//                 }
//             for(int j = 1; j <= i; j++) {

//                 System.out.print(j + " ");
            
//             }
//             System.out.println();
//         }
//     }
// }
/*
    * * * *
    * * *
    * *
    *
//  */
// public class Temp0 {

//     public static void main(String[] args) {
//          for(int i = 4; i >= 1; i--) {

//             for(int j = 1; j <= i; j++) {

//                 System.out.print("*" + " ");
//             }
//             System.out.println();
//          }
//     }
// // }
// public class Temp0{
//   public  static int sum(int a, int b){
//         int sum = a + b;
//         return sum;
//     }
//     public static void main(String[] args) {
       
//         System.err.println(sum(10, 20));
//     }
// }
public class Temp0 {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        int choice = 2;
         {
            switch (choice) {
                case 1:
                     {
                        System.out.println(a+b);
                    }
                    break;
                    case 2:
                    {
                        System.out.println(b - a);
                    }
                   
            
                default:
                    break;
            }
        } 
    }
}