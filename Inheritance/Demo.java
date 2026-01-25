//=============== Parent -> child =================
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
 //=================== Employee -> Developer ====================

 class Employee {
   protected int employee_id;
    protected String employee_name;
     protected float employee_salary;
     void show() {
        System.out.println("Employee Id     : "+employee_id);
        System.out.println("Employee name   : "+employee_name);
        System.out.println("Employee salary : "+employee_salary);
     }
 }
 class Developer extends Employee {
    int developer_id;
    String developer_name;
    float developer_salary;
        Developer(int developer_id, String developer_name, float developer_salary) {
            this();
            this.developer_id = developer_id;
            this.developer_name = developer_name;
            this.developer_salary = developer_salary;
        }
        Developer() {
            show();
            employee_id = 101;
            employee_name = "Aditya Yadav";
            employee_salary = 55000;
            System.out.println("Developer Name      : "+developer_id);
            System.out.println("Developer Name      : "+developer_name);
            System.out.println("Developer Salary    : "+developer_salary);
             
        }
 }
public class Demo{
    public static void main(String[] args) {
        Developer obj = new Developer(501, "Akash Yadav", 98000);
    }
}

// ===========Updated version =============
class Employee {
    protected int employee_id;
    protected String employee_name;
    protected float employee_salary;

    void showEmployee() {
        System.out.println("Employee Id     : " + employee_id);
        System.out.println("Employee Name   : " + employee_name);
        System.out.println("Employee Salary : " + employee_salary);
    }
}

class Developer extends Employee {

    int developer_id;
    String developer_name;
    float developer_salary;

    Developer(int developer_id, String developer_name, float developer_salary) {

        // parent data
        employee_id = 101;
        employee_name = "Aditya Yadav";
        employee_salary = 55000;

        // child data
        this.developer_id = developer_id;
        this.developer_name = developer_name;
        this.developer_salary = developer_salary;
    }

    void showDeveloper() {
        showEmployee();
        System.out.println("Developer Id     : " + developer_id);
        System.out.println("Developer Name   : " + developer_name);
        System.out.println("Developer Salary : " + developer_salary);
    }
}

public class Demo {
    public static void main(String[] args) {

        Developer obj = new Developer(501, "Akash Yadav", 98000);
        obj.showDeveloper();
    }
}