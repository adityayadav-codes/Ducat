//class Level Variable

// public  class DataType {
// 	static int  x;
// 	static float f;
// 	static boolean b;
// 	static char ch;
// 	public static void main (String args []) {
	
// 		System.out.println(x);
// 		System.out.println(b);
// 		System.out.println(ch);
// }
// }

// local Level Variable
// public class DataType{
//     public static void main(String[] args) {
//         int x ;
//         System.out.println(x);
//     }
// }

// implicit Type Casting
// public class DataType{
//     static void show(byte b){ 
//         System.out.println("Byte Value : "+b);
//     }
//     static void show(short s){ 
//         System.out.println("Short Value : "+s);
//     }
//     static void show(int i){ 
//         System.out.println("Int Value : "+i);
//     }
//     public static void main(String[] args) {
//         show(10);
//     }
// }
// explicit Type Casting
public class DataType{
    public static void main(String[] args) {
        int i = 65;
        System.out.println((char)i);
    }
}