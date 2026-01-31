// public class MeOv {
// 	void add(int x, int y) {
// 		System.out.println("x + y = "+(x + y));
// 	}
// 	void add(int x, int y, int z ) {
// 		System.out.println("x + y + z = "+(x + y + z));
// 	}
// 	void add(int x, int y, int z, int a) {
// 		System.out.println("x + y + z + a = "+ (x + y + z + a));
// 	}
	
// 	public static void main(String args []) {
// 		MeOv  m1 = new MeOv();
// 		m1.add(10, 20);
// 		m1.add(10,20,30);
// 		m1.add(10,20,30,40);
		
// 	}
// }

// Example 2 :

// public class MeOv {

//     static  double pi  = 3.14;
//     void area(int side) { // Area of square
//         System.out.println("Area of square = "+(side * side));
//     }
//     void area(int lengh, int breadth) { // Area of rectangle
//         System.out.println("Area of Rectangle = "+(lengh * breadth));
//     }
//     void area(double radius) { // Area of circle 
//         System.out.println("Area of circle = "+(2 * pi * radius));
//     }
//    public static void main(String[] args) {
//     MeOv c1 = new MeOv();
//     c1.area(20);
//     c1.area(10, 20);
//     c1.area(10.2);
//    }
    
// }

// Example 3 :
public class MeOv { // Bank class

    private double balance;
    // deposit block
    void deposit(int amount) { // method 1:
       
        balance += amount;
        System.out.println("Deposited: "+amount);
    } 
    void deposit(double amount){ // method 2:
        balance +=amount;
        System.out.println("Deposited: "+amount);
    }
    
}
   