// default Constructor
// public class Google {
//     int id;
//     String name;
//     int salary;
// static String cname = "Google";

//     Google() {
//         id = 101;
//         name = "Aditya Yadadv";
//         salary = 34343;
//     }
//     void display(){
//         System.out.println("Id : "+id);
//         System.out.println("Name : "+name);
//         System.out.println("Salary : "+salary);
//         System.out.println("Comapany Name : "+cname);
//     }
//     public static void main(String[] args) {
//         Google emp1 = new Google();
//         emp1.display();
//         Google emp2 = new Google();
//         emp2.display();
//         Google emp3 = new Google();
//         emp3.display();
//     }
// }

//  Parameterized Constructor

public class Google {
    int id;
    String name;
    int salary;
    static String cname = "Google";

    Google (int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    void display() {
        System.out.println("Id : "+id);
        System.out.println("Name : "+name);
        System.out.println("Salary : "+salary);
        System.out.println("Company Name : "+cname);
    }
    public static void main(String [] args) {
        Google emp1 = new Google(101, "Aditya Yadav", 34323);
        emp1.display();
        Google emp2 = new Google(102, "Akash Yadav", 343225);
        emp2.display();
        Google emp3 = new Google(103, "Anil Singh", 645434);
        emp3.display();
    }
}