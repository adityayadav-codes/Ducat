class Parent {
    int x;
    int y;

        void calculate() {
            System.out.println("x =  "+x  + " "+ "y =  "+y);
            System.out.println("Addition : "+(x+y));
            System.out.println("Product  : "+(x*y));
        }
}
class Child extends Parent {
    void setData() {
        x = 10;
        y = 20;
    }
    void getData(){
        calculate();
    }
}
public class Demo {

    public static void main(String[] args) {

        Child obj = new Child();
        obj.setData();
        obj.getData();
    }
}    
