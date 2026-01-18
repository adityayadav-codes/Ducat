// Paramertrized constructor example in Java
public class cons{
    int id;
    String name;
     
    cons(int id1, String name1) {
        id = id1;
        name = name1;
    }
    void show() {
        System.out.println("ID :" + id +"\nName : "+name);
    }
    public static void main(String [] args ) {
        cons stu1 = new cons(230714, "Alice Parry");
        stu1.show();
    }
}