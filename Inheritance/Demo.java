class Parent {
    int x;
    int y;

        void show() {
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
        show();
    }
}
public class Demo {

    public static void main(String[] args) {

        Child obj = new Child();
        obj.setData();





        obj.getData();
    }
}    
