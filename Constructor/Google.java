// default Constructor
public class Google {
    int id;
    String name;
    int salary;
static String cname = "Google";

    Google() {
        id = 101;
        name = "Aditya Yadadv";
        salary = 34343;
    }
    void display(){
        System.out.println("Id : "+id);
        System.out.println("Name : "+name);
        System.out.println("Salary : "+salary);
        System.out.println("Comapany Name : "+cname);
    }
    public static void main(String[] args) {
        Google emp1 = new Google();
        emp1.display();
        Google emp2 = new Google();
        emp2.display();
        Google emp3 = new Google();
        emp3.display();
    }
}