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

public class Calculator {

        static pi = 3.14;
    void area(int side) { // Area of square
        System.out.println("Area of square = "+(side * side));
    }
    void area(int lengh, int breadth) { // Area of rectangle
        System.out.println("Area of Rectangle = "+(lengh * breadth));
    }
    void area(double radius) { // Area of circle 
        System.out.println("Area of circle = "+(2 * pi * radius));
    }
   
}